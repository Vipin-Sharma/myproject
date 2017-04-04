/**
 * Created by Ekta on 7/18/2015.
 * Rank #43103 after solving this
 */
import java.util.*;
import java.lang.*;

public class RevAdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        if(scan.hasNext()){
            int linesToRead = scan.nextInt();

            for (int i = 0; i < linesToRead; i++) {
                int firstInt = scan.nextInt();
                int secondInt = scan.nextInt();

                int revFirstInt = reverseNumber(firstInt);
                int revSecondInt = reverseNumber(secondInt);

                System.out.println(reverseNumber(revFirstInt+revSecondInt));

                /*System.out.println(scan.next());
                System.out.println(scan.next());*/
            }
        }
        else{
            System.exit(1);
        }

    }

    private static int reverseNumber(int number) {
        int a=0;
        int b=number;
        int revNum=0;
        if (number!=0){
            while(b!=0) {
                a = b % 10;
                b = b / 10;
                revNum = revNum*10 +a;
            }
            return revNum;
        }
        else{
            return 0;
        }
    }
}
