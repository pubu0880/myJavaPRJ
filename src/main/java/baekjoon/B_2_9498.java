package baekjoon;

import java.util.Scanner;

public class B_2_9498 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (a >=0 && a <= 100) {
            if (a >= 90) {
                System.out.print("A");
            } else if (a >= 80) {
                System.out.print("B");
            } else if (a >= 70) {
                System.out.print("C");
            } else if (a >= 60) {
                System.out.print("D");
            } else {
                System.out.print("F");
            }
        }
    }
}
