
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class SmallestNumNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int notes[] = { 1, 2, 5, 10, 50, 100 };
        while (t != 0) {
            int a = sc.nextInt();
            int count = 0;
            while (a != 0) {
                for (int i = notes.length - 1; i >= 0; i--) {
                    if (a >= notes[i]) {
                        count = count + a / notes[i];
                    }
                    a = a % notes[i];
                }
            }
            System.out.println(count);
            t--;
        }
        sc.close();
    }
}