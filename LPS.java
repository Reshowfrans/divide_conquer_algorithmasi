public class LPS{
    
    public static void main(String[] args){
        System.out.println("Longest Palindrome Sequence");
        String s = "ELRMENMET";
        int result = findLPS(s, 0,s.length() -1);
        System.out.println(result);
    }

    private static int findLPS(String s, int start, int end){
        if(start>end){
            return 0;
        }
        if(start == end){
            return 1;
        }
        int option3 = 0;
        if(s.charAt(start) == s.charAt(end)){
           option3 = 2+ findLPS(s, start+1, end-1);
        }
        int option1 = findLPS(s, start, end-1);
        int option2 = findLPS(s, start+1, end);

        return Math.max(option1, Math.max(option3, option2));
    }
}
