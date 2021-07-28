
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class FirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long a[] = new long[10000];
        int i = 0;
        while (t != 0) {
            long b = sc.nextLong();
            for (; b != 0; b /= 10) {
                a[i] = b % 10;
                i++;
            }
            System.out.println(a[0] + a[i - 1]);
            t--;
            i = 0;
        }
        sc.close();
    }
}
