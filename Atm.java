
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int withdraw = sc.nextInt();
        float balance = sc.nextFloat();

        if (withdraw != 0 && withdraw % 5 == 0 && withdraw + 0.5 <= balance) {
            System.out.format("%.2f", balance - (withdraw + 0.50));
        } else {
            System.out.format("%.2f", balance);
        }
        sc.close();
    }
}