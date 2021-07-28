
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;
import java.math.*;

public class SmallFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            BigInteger fac = new BigInteger("1");
            while (n > 1) {
                fac = fac.multiply(BigInteger.valueOf(n));
                n--;
            }
            System.out.println(fac);
            t--;
        }
        sc.close();
    }
}
