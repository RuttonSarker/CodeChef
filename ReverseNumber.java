
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int reverse = 0;
        while (t != 0) {
            int a = sc.nextInt();
            for (; a != 0; a /= 10) {
                int digit = a % 10;
                reverse = reverse * 10 + digit;
            }
            System.out.println(reverse);
            reverse = 0;
            t--;
        }
        sc.close();
    }
}
