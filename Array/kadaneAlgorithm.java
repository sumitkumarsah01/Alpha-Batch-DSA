/*What is Kadan Algorithm ?
 kadane algorithm ye kahta hai ki aagr kisi subarray ka sum negative aa rha hai to usko 0 consider krenge .*/

 
public class kadaneAlgorithm {
    public static void kadane(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currentSun=0;

        for(int i=0;i<arr.length;i++){
            currentSun=currentSun+arr[i];
            if(currentSun<0){
                currentSun=0;
            }
            maxSum=Math.max(currentSun,maxSum);
        }

        System.out.println("This is Our Final Result = "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        kadane(arr);
    }
    
}
