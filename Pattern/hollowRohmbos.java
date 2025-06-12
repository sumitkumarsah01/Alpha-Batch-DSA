public class hollowRohmbos {
    public static void hollow(int totRows,int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totRows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=totCols;k++){
                if(i==1||i==totRows||k==1||k==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
                
            }
            System.out.println();


        }
        
    }
    public static void main(String[] args) {
        hollow(5, 5);
        
    }
    
}
