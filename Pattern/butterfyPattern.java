public class butterfyPattern {
    public static void butterfly(int totRows){
        for(int i=1;i<=totRows;i++){
            //star+space+star


            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(totRows-i);k++){
                System.out.print(" ");
            }
            for(int s=1;s<=i;s++){
                System.out.print("*");
            }
            System.out.println();


        }
        for(int i=totRows;i>=1;i--){
            //star+space+star
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(totRows-i);k++){
                System.out.print(" ");
            }
            for(int s=1;s<=i;s++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    public static void main(String[] args) {
        butterfly( 4);
        
    }
    
}
