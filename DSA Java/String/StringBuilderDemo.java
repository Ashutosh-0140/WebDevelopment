public class StringBuilderDemo{
    public static void main(String s[]){
        StringBuilder sb = new StringBuilder();
        //sb.toString();
        
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);

    }
}