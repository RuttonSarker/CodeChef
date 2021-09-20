
/*
 Solved by Rutton Chandra Sarker 
 August 2021 Codechef challenge Division 3
*/
import java.util.*;

public class ChefBulbInvention {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int k = sc.nextInt();
            int day = 1;
            int mod = p % k;

            for (int s = mod; s < k; s++) {
                for (int i = s; i < n; i += k) {
                    if (i == p) {
                        System.out.println(day);
                        break;
                    }
                    day++;
                }
            }
            t--;
        }
    }
}
