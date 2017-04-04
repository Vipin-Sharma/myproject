import java.util.*;

public class PrimeNumber
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Please enter the first number");
        num1 = sc.nextInt();
        System.out.println("Please enter the Second number");
        num2 = sc.nextInt();
        System.out.println("Prime number: ");
        for (int i=num1; i <= num2; i++ ){
            int j;
            for (j=2; j<i; j++){
                int n = i%j;
                if (n==0){
                    break;
                }
            }
            if(i == j){
                System.out.print(" "+i);
            }
        }
        System.out.println();
    }

    public static boolean is_prime(int n) {
        if (n<=1)
            return false;
        else if (n<=3)
            return true;
        else if (n % 2 == 0 || n % 3 == 0)
            return false;

        int i=5;
        while (i*i<=n){
            if (n % i == 0 || n %(i + 2) == 0)
               return false;
            i=i + 6;
        }
        return true;
    }
}