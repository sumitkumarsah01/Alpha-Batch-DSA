public class floydTriangle {
    public static void floyd(int totRows,int totCols){
        int n=1;
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n);
                 n++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyd(4, 4);
        
    }
    
}
