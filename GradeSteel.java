
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class GradeSteel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int hardness = sc.nextInt();
            double carbonContent = sc.nextDouble();
            int tensileStrength = sc.nextInt();

            if (hardness > 50 && carbonContent < 0.7 && tensileStrength > 5600) {
                System.out.println("10");
            } else if (hardness > 50 && carbonContent < 0.7 && tensileStrength <= 5600) {
                System.out.println("9");
            } else if (hardness <= 50 && carbonContent < 0.7 && tensileStrength > 5600) {
                System.out.println("8");
            } else if (hardness > 50 && carbonContent >= 0.7 && tensileStrength > 5600) {
                System.out.println("7");
            } else if (hardness > 50 || carbonContent < 0.7 || tensileStrength > 5600) {
                System.out.println("6");
            } else {
                System.out.println("5");
            }
            t--;
        }
        sc.close();
    }
}
