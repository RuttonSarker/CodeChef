
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class LuckyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t != 0) {
            int n = sc.nextInt();
            int count = 0;
            for (; n != 0; n /= 10) {
                if (n % 10 == 4) {
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
        sc.close();
    }
}
