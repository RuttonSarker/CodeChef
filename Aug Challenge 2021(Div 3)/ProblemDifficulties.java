
/*
 Solved by Rutton Chandra Sarker 
 August 2021 Codechef challenge Division 3
*/
import java.util.*;

public class ProblemDifficulties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int a[] = new int[4];
            int set = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int s = 0;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] != a[j + 1]) {
                    set++;
                    s++;
                }
            }
            System.out.println(set);
            t--;
        }
        sc.close();
    }
}