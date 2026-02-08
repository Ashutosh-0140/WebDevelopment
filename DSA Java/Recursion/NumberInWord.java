public class NumberInWord{
    public static void InWord(String num, int pos){
        if(pos == num.length()){
            return;
        }
        switch(num.charAt(pos)){
            case '1':System.out.print(" One ");break;
            case '2':System.out.print(" Two ");break;
            case '3':System.out.print(" Three ");break;
            case '4':System.out.print(" Four");break;
            case '5':System.out.print(" Five ");break;
            case '6':System.out.print(" Six ");break;
            case '7':System.out.print(" Seven ");break;
            case '8':System.out.print(" Eight ");break;
            case '9':System.out.print(" Nine ");break;
            case '0':System.out.print(" Zero ");break;
            default: return;
        }
        InWord(num, pos+1);
    }
    public static void main(String s[]){
        String num = "2005";
        int pos = 0;
        InWord(num, pos);
    }
}