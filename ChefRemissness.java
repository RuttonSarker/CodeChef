
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class ChefRemissness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = a + b;
            if (a > b) {
                System.out.println(a + " " + c);
            } else {
                System.out.println(b + " " + c);
            }
            t--;
        }
        sc.close();
    }
}
