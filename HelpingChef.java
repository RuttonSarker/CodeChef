
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class HelpingChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int a = sc.nextInt();
            if (a < 10) {
                System.out.println("Thanks for helping Chef!");
            } else {
                System.out.println("-1");
            }
            t--;
        }
        sc.close();
    }
}
