public class LargestString{
    public static void Largest(String large[]){
        String largest = large[0];
        for(int i = 0; i<large.length; i++){
            if(largest.compareTo(large[i])<0){
                largest = large[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String s[]){
        String fruit[] = {"apple", "banana", "orange"};
        Largest(fruit);
    }
}