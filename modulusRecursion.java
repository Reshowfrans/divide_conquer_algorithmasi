import java.util.Scanner;

public class modulusRecursion {
    
    public static int modulo(int N, int z){
        
        int count =0;
        if(N == 1){
            return (z == 0) ? 1 : 0;
        }
        else{
            if((N-1)*(N-1)%N == z){
                count++;
            }
            count += modulo(N - 1, z);
        }

        return count;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input your N: ");
        int N = input.nextInt();
        
        System.out.print("Input your z: ");
        int z = input.nextInt();

        int result = modulo(N, z);
        System.out.println(result);
        
    }

}
