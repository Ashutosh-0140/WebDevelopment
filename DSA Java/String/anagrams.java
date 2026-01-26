public class anagrams {
    public static boolean isanagram(String s1, String s2){

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        if(sb1.length() == sb2.length()){
            int count1 = 0;
                for(int i=0; i<sb1.length(); i++){
                    for (int j = 0; j < sb1.length(); j++) {
                        if (sb2.charAt(i) == sb1.charAt(i)) {
                            count1++;
                    }
                }
            }
        }


    }
    public static void main(String[] args) {
        String str = "programming";
        
    }
}