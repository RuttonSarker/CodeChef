
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class LeadGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int max = 0, index = 0;
        int scoreA = 0, scoreB = 0;
        int lead[] = new int[t];
        int player[] = new int[t];

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            scoreA += a;
            scoreB += b;
            lead[i] = Math.abs(scoreA - scoreB);

            if (scoreA > scoreB) {
                player[i] = 1;
            } else {
                player[i] = 2;
            }
        }
        for (int i = 0; i < t; i++) {
            if (max < lead[i]) {
                max = lead[i];
                index = i;
            }
        }
        System.out.println(player[index] + " " + max);
        sc.close();
    }
}