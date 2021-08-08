
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class PuppySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int d = sc.nextInt();
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < d; i++) {
                for (int j = n; j > 0; j--) {
                    sum += j;
                }
                n = sum;
                sum = 0;
            }
            System.out.println(n);
            t--;
        }
        sc.close();
    }
}