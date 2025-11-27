package premkumar;
import java.util.*;

public class Checker {

    public static void check(int n){
        if(n%2==0){
            System.out.println("the given number is Even");


        }else{
            System.out.println("the given number is Odd.");

        }

    }

    public static boolean checkResult(int n){
        if(n>=33){
            return true;
        }else{
            return false;
        }
    }

    public static void checkSign(int n){
        if(n>=0){
            System.out.println("the number is Positive.");

        }else{
            System.out.println("the number is negative.");
        }
    }

    public static void printNum(int n){
        for(int i=1 ;i<=n;i++){
            System.out.println(i+" ");
        }
    }

    public static void squarePattern(int n){
        for(int i=1 ;i<=n;i++){
            for(int j=1 ;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int reverseNum(int n){
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10 +r;

            n=n/10;
        }
        return rev;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(reverseNum(n));

        sc.close();
    }
}
