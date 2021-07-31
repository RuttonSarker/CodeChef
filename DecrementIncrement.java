
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class DecrementIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 4 == 0) {
            a++;
        } else {
            a--;
        }
        System.out.println(a);
        sc.close();
    }
}
