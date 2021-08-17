
/*
    CodeChef Starters 9 Division 3
    solved by Rutton Chandra Sarker
*/
import java.util.*;

public class LargeSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            for (int i = n; i > 0; i--) {
                double m = Math.sqrt(i);
                if (m % 1 == 0) {
                    System.out.println((int) m * a);
                    break;
                }
            }
            t--;
        }
        sc.close();
    }
}
