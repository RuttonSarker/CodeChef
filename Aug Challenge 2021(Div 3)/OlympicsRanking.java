
/*
 Solved by Rutton Chandra Sarker 
 August 2021 Codechef challenge Division 3
*/
import java.util.*;

public class OlympicsRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[3];
        int b[] = new int[3];

        while (t != 0) {
            int countA = 0, countB = 0;
            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();
                countA += a[j];
            }
            for (int k = 0; k < b.length; k++) {
                b[k] = sc.nextInt();
                countB += b[k];
            }
            if (countA > countB) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
            t--;
        }
        sc.close();
    }
}