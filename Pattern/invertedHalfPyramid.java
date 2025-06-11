public class invertedHalfPyramid {
    public static void Half(int totRows,int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totRows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }

            System.out.println();

        }
    }
    public static void main(String[] args) {
        Half(4, 4);
        
    }
    
}
