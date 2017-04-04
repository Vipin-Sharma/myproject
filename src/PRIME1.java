/**
 * Created by Ekta on 7/18/2015.
 */

import java.lang.*;
import java.util.*;

public class PRIME1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if (scan.hasNext()) {
            int i = scan.nextInt();
            for (int j = 0; j < i; j++) {
                printPrimeNumbersInRange(scan.nextInt(), scan.nextInt());

            }
        }
        /*printPrimeNumbersInRange(999900000,1000000000);
        printPrimeNumbersInRange(999900000,1000000000);
        printPrimeNumbersInRange(999900000,1000000000);
        printPrimeNumbersInRange(999900000,1000000000);
        printPrimeNumbersInRange(999900000,1000000000);*/
    }

    private static void printPrimeNumbersInRange(int a, int b) {
        boolean even = false;

        if (a == 1) {
            a = a + 2;
            System.out.println(2);
        }
        if (a == 2) {
            a = a + 1;
            System.out.println(2);
        }

        if (a % 2 == 0) {
            a = a + 1;
        }


        for (int i = a; i <= b; i = i + 2) {
            int z = (int) Math.sqrt(i);
            z++;
            if (i % 2 == 0) {
                continue;
            }
            boolean flag = true;
            for (int j = 3; j <= z; j = j + 2) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }

}

