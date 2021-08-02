
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class BlockGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int num = sc.nextInt();
            int newNum = 0;
            for (int n = num; n != 0; n /= 10) {
                int d = n % 10;
                newNum = newNum * 10 + d;
            }
            if (newNum == num) {
                System.out.println("wins");
            } else {
                System.out.println("loses");
            }
            t--;
        }
        sc.close();
    }
}