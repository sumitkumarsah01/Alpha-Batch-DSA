public class solidRohmbus {
    public static void rohmbus(int totRows){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=(totRows-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=totRows;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rohmbus(5);
        
    }
    
}
