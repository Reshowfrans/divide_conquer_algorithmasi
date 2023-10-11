public class Convert{
    
    public static void main(String[] args){
        System.out.println("Convert String");
        int result = findMin("table", "tbres", 0, 0);
        System.out.println(result);

    }
    private static int findMin(String s1, String s2, int ind1, int ind2){
        if(ind1 == s1.length()){
            return s2.length() - ind2;
        }
        if(ind2 == s2.length()){
            return s1.length() - ind1;
        }
        if(s1.charAt(ind1) == s2.charAt(ind2)){
            return findMin(s1, s2, ind1+1, ind2+1);
        }
        int del = 1 + findMin(s1, s2, ind1, ind2+1);
        int ins = 1 + findMin(s1, s2, ind1+1, ind2);
        int rep = 1 + findMin(s1, s2, ind1+1, ind2+1);
        
        return minVal(del, ins, rep);
    }
    private static int minVal(int del, int ins,int rep){
        int minv = Math.min(ins, del);
        int finalV = Math.min(minv,rep);

        return finalV;
    }
}
