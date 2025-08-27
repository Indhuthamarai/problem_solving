select s.user_id,coalesce(round(
    count(case when c.action='confirmed' then 1 end)/
    nullif(count(case when c.action in ('confirmed','timeout') then 1 end),0)
    ,2),0) as confirmation_rate from Signups s left join Confirmations c on s.user_id=c.user_id group by s.user_id order by confirmation_rate;