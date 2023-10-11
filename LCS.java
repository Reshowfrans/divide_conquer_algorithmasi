public class LCS {
    
    public static void main(String[] args){
        System.out.println("Longest Common subsequence");
        int result = longest("elephant", "erapat", 0, 0);
        System.out.println(result);
    }

    private static int longest(String s1, String s2, int ind1, int ind2) {
        if (ind1 == s1.length() || ind2 == s2.length()) {
            return 0;
        }
    
        int option3 = 0;
        if (s1.charAt(ind1) == s2.charAt(ind2)) {
            option3 = 1 + longest(s1, s2, ind1 + 1, ind2 + 1);
        }
        int option1 = longest(s1, s2, ind1, ind2 + 1);
        int option2 = longest(s1, s2, ind1 + 1, ind2);
    
        return Math.max(option1, Math.max(option3, option2));
    }
    
}
