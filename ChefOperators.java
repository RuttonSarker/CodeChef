
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class ChefOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) {
                System.out.println("<");
            } else if (a > b) {
                System.out.println(">");
            } else if (a == b) {
                System.out.println("=");
            }
            t--;
        }
        sc.close();
    }
}
