public class reverseBits{


    public static void main(String[] args){


        int n = 123456789;
        int result  = reversBits(n);
        System.out.println(result);
    
    }

    public static int reversBits(int n) {
        String s = Integer.toString(n);
        String reversed = reverse(s);

        return Integer.parseInt(reversed);
    }

   public static String reverse(String s) { 
        if(s.length() == 0) 
            return ""; 
        return s.charAt(s.length() - 1) + reverse(s.substring(0,s.length()-1)); 
     }
    
}
