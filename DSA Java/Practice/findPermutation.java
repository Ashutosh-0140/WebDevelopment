public class findPermutation {
    public static void findPermutations(String str, String ans, boolean[] used) {
        
        if (ans.length() == str.length()) {
            System.out.println(ans);
            return;
        }

        // Try each character
        for (int i = 0; i < str.length(); i++) {
            if (!used[i]) { 
                used[i] = true; 
                findPermutations(str, ans + str.charAt(i), used); 
                used[i] = false; 
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        boolean[] used = new boolean[str.length()];
        findPermutations(str, "", used);
    }
}