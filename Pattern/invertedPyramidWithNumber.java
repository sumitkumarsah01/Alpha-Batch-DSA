public class invertedPyramidWithNumber {
    public static void NumPyramid(int totRows,int totCols){
        for(int i=0;i<=totRows;i++){
            for(int j=1;j<=totRows-i+1;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        NumPyramid(4,4);
        
    }
    
}
