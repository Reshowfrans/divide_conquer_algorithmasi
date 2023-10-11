public class NnumberFactor {
    
    public static void main(String[] args){
        System.out.println("Number Factor!!");
        System.out.println();

        System.out.println(getN(4));
        System.out.println(getN(5));
        System.out.println(getN(6));
    }

    private static int getN(int n){
        if(n == 0 || n == 1 || n==2){
            return 1;
        }
        if(n == 3){
            return 2;
        }
        int sub1 = getN(n-1);
        int sub2 = getN(n-3);
        int sub3 = getN(n-4);

        return sub1 + sub2 + sub3;
    }
}
