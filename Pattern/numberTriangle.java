public class numberTriangle {
    public static void number(int totRows,int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        number(4, 4);
        
    }
    
}
