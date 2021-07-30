
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class SquareRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            long a = sc.nextLong();
            System.out.println((int) Math.sqrt(a));
            t--;
        }
        sc.close();
    }
}
