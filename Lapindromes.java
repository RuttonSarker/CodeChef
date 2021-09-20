
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class Lapindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t != 0) {
            String s = sc.nextLine();
            int count = 0;
            int len = s.length() / 2;
            String first = (s.substring(0, len));
            String last = (s.substring(s.length() - len));
            String c = " ";
            for (int i = 0; i < first.length(); i++) {
                for (int j = 0; j < last.length(); j++) {
                    if (first.charAt(i) == last.charAt(j)) {
                        c = last.replace(last.charAt(j), 'X');
                        count++;
                        break;
                    }
                    System.out.println("R:" + last);
                }
                last = c;
                System.out.println("R:" + last);
            }
            if (count == len) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}
