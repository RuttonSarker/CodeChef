
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class TriangleSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int max = 0, sum = 0;
            for (int i = n; i >= 1; i--) {
                for (int j = (n - (n - i)); j <= n; j++) {
                    int a = sc.nextInt();
                    if (i != n && max < a) {
                        max = a;
                    }
                }
                sum += max;
                max = 0;
            }
            System.out.println(sum);
            t--;
        }
    }
}
