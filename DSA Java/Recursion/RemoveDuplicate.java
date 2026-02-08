class RemoveDuplicate{
    public static void DuplicateRemove(String s, boolean arr[], StringBuilder sb, int idx ){
        if(idx == s.length()){
            System.out.println(sb);
            return ;
        }
        char curChar = s.charAt(idx);
        if(arr[curChar - 'a'] == true){
            DuplicateRemove(s, arr, sb, idx+1);
        }
        else{
            arr[curChar-'a']= true;
            DuplicateRemove(s, arr, sb.append(curChar), idx+1);
        }

    }
    public static void main(String s[]){
        String str = "ashutosh";
        boolean arr[] = new boolean[26];
        DuplicateRemove(str, arr, new StringBuilder(""), 0 );
    }
}