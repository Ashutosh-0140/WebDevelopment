public class shortestPath{
    public static float findShortestPath(String path){
        int x =0, y=0;
        for(int i=0; i<path.length()-1; i++){
            if(path.charAt(i) == 'E'){
                x++;
            }
            else if(path.charAt(i) == 'W'){
                x--;
            }
            else if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)== 'S'){
                y--;
            }
            else{
                System.out.println("Invelid character entered.");
            }
        }
        float Shortestpath = (float)Math.sqrt(x*x + y*y);
        return Shortestpath;
    }
    public static void main(String s[]){
        String str = "WNEENESENENEN";
        float path = findShortestPath(str);
        System.out.println(path);
    }
}