SELECT 
    s.user_id,
    ROUND(
        COALESCE(SUM(c.action = 'confirmed') * 1.0 
                 / NULLIF(SUM(c.action IN ('confirmed','timeout')), 0), 0),
        2
    ) AS confirmation_rate
FROM Signups s
LEFT JOIN Confirmations c 
  ON s.user_id = c.user_id
GROUP BY s.user_id;
