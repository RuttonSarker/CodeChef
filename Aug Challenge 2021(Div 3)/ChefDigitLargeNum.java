
/*
 Solved by Rutton Chandra Sarker 
 August 2021 Codechef challenge Division 3
*/
import java.util.*;

public class ChefDigitLargeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t != 0) {
            int count = 0;
            int n = sc.nextInt();
            int factorial = 1, digit = 0, mul = 1;

            for (int i = 1; i <= n; i++) {

                for (int j = i; j != 0; j /= 10) {
                    mul = mul * (j % 10);
                    digit++;
                }
                // System.out.println("M:" + mul + " " + "D:" + digit);
                while (digit > 0) {
                    factorial = factorial * digit;
                    digit--;
                }
                // System.out.println("F:" + factorial);
                if (mul >= factorial) {
                    count++;
                }
                // System.out.println("C:" + count);
                mul = 1;
                digit = 0;
                factorial = 1;
            }
            System.out.println("R:" + " " + (count));
            t--;
        }
    }
}