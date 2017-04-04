import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Ekta on 7/18/2015.
 */
public class FCTRL2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t=0;
        if(scan.hasNext()){
            t=scan.nextInt();
        }
        for (int i = 0; i < t; i++) {
            printFactorial(scan.nextInt());
        }
    }

    private static void printFactorial(int i) {
        BigInteger fact = BigInteger.valueOf(i);
        for (int j = 1; j < i; j++) {
            fact= fact.multiply(BigInteger.valueOf(j));
        }
        System.out.println(fact);
    }
}