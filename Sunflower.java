import java.util.Scanner;

public class Sunflower{

    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        
        int D = key.nextInt();
        int minH = key.nextInt();
        int res = finalHeight(minH,D);
        System.out.println(res);

        
       
    }
    
    private static long totalHeight(long hInit, int D){

        long height = hInit;
        for(int i=1;i<=D;i++){
            height = (height + (int)Math.sqrt(height));
        }
        return height;
    }
    private static int finalHeight(int minH, int D){
        long low = 1;
        long high = 1_000_000_000;

        while(low<high){
            long mid = (low+high)/2;
            if(totalHeight(mid, D)>=minH){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }



        return (int)low;
    }
}
