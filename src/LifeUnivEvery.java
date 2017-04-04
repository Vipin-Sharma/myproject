import java.util.Scanner;

/**
 * Created by Ekta on 7/5/2015.
 * Rank After this #43104
 */
public class LifeUnivEvery {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            if (scanner.hasNext()){
                int i = scanner.nextInt();
                if(i==42){
                    System.exit(0);
                }
                System.out.println(i);
            }
        }
    }
}
