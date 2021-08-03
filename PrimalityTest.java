
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int num = sc.nextInt();
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            t--;
        }
        sc.close();
    }
}