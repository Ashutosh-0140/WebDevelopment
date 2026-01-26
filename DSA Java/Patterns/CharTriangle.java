class CharTriangle{
    public static void main(String[] args) {
        char ch = 'A';
        int n=4;
        for(int line =1; line<=n; line++){
            for(int j=1; j<=line; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        
    }
}