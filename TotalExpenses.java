
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int quantity = sc.nextInt();
            int price = sc.nextInt();
            double expense = (double) quantity * price;
            if (quantity > 1000) {
                System.out.format("%.6f\n", expense - (expense * 0.1));
            } else {
                System.out.format("%.6f\n", expense);
            }
            t--;
        }
        sc.close();
    }
}
