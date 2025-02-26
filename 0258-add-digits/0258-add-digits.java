import java.util.Scanner;

public class Solution {
    public static int addDigits(int n) {
        int r = 0;
        while (n > 0) {
            r = r + n % 10;
            n = n / 10;
        }
        while (r >= 10) {
            int temp = r;
            int sum = 0;
            while (temp > 0) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }
            r = sum;
        }

        return r;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = addDigits(n);
        System.out.println(result);
    }
}
