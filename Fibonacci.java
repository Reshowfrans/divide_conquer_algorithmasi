public class Fibonacci {
    
    public static void main(String[] args){
        System.out.println("Fibonaci!!");
        int n = 4;
        int result = fibo(n);
        System.out.println(result);

    }

    private static int fibo(int n){
        if(n<=0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
}
