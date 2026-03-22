class Count{
    public static void countVCS(String str){
        int countVowel = 0;
        int countConsonant = 0;
        int countSpaces = 0;
        for(int i = 0; i<=str.length()-1; i++){
            if(str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e'|| str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'O'||str.charAt(i) == 'o'||str.charAt(i) == 'U'||str.charAt(i) == 'u'){
                countVowel++;
            }
            else if(str.charAt(i) == ' '){
                countSpaces++;
            }
            else countConsonant++;
        }

        System.out.println("Number of vowel in the String is "+countVowel);
        System.out.println("Number of consonant in the String is "+countConsonant);
        System.out.println("Number of spaces in the String is "+countSpaces);
    }
    public static void main(String s[]){
        
        String str = "My Name is ashutosh Sahu";
        countVCS(str);
    }
}