
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int salary = sc.nextInt();
            if (salary < 1500) {
                double gross_salary = (double) (salary + (salary * 0.1)) + (salary * .90);
                System.out.format("%.2f\n", gross_salary);
            } else if (salary >= 1500) {
                double gross_salary = (double) (salary + 500 + (salary * .98));
                System.out.println(gross_salary);
            }
            t--;
        }
        sc.close();
    }
}
