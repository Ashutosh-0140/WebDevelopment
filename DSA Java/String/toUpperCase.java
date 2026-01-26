public class toUpperCase{
    public static void upper(String s){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==' '&& i<=s.length()){
                sb.append(s.charAt(i));
                sb.append(Character.toUpperCase(s.charAt(i+1)));
                i++;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String s[]){
        String s1 = "my name is ashutosh sahu.";
        upper(s1);
    }
}