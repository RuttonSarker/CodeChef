
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class EnormousInputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n != 0 && n % k == 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}