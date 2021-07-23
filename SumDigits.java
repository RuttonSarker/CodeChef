
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int num = 0;

        while (t != 0) {
            int n = sc.nextInt();
            for (; n != 0; n /= 10) {
                int digit = n % 10;
                num += digit;
            }
            System.out.println(num);
            num = 0;
            t--;
        }
        sc.close();
    }
}
