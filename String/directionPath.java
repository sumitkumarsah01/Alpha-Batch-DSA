public class directionPath {
    public static float shortestpat(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);

            if(dir=='W'){
                x--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else{
                x++;
            }
        }

        int x2=x*x;
        int y2=y*y;

        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(shortestpat(path));
    }
    
}
