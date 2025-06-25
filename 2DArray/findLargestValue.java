import java.util.*;
public class findLargestValue {

    // this Function  are find the largest element in given 2DArray

       public static void largestElement(int matrix[][]){
         int n=matrix.length, m=matrix[0].length;
           int largest=Integer.MIN_VALUE;
           for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
           }
           System.out.println("This is Our Largest Element = "+largest);
       }

        // this function are find the Smallest Element in Given 2DArray
       public static void smallestElement(int matrix[][]){
         int n=matrix.length, m=matrix[0].length;
           int Smallest=Integer.MAX_VALUE;
           for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(Smallest>matrix[i][j]){
                    Smallest=matrix[i][j];
                }
            }
           }
           System.out.println("This is Our Smallest Element = "+Smallest);
       }


    public static void main(String[] args) {
        int matrix[][]=new int [3][3];
        int n=matrix.length, m=matrix[0].length;
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        largestElement(matrix);
        smallestElement(matrix);
    }
    
}
