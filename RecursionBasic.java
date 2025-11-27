public class RecursionBasic {

    public static void printNum(int n){
        if(n==10){
            System.out.print(10);
            return;
        }
        System.out.print(n+" ");
        printNum(n+1);
    }

    public static  int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int sumNat(int n){
        if(n==1){
            return 1;
        }
        return n +sumNat(n-1);
    }

    public static int fibo(int n){

        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(fibo(n));
        
    }
}
