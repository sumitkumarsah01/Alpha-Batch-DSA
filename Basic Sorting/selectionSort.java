public class selectionSort {
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                   minPos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
        
    }
    
    public static void main(String[] args) {
        int arr[]={5,3,10,4,2,9,1,6,8,7};
        selection(arr);
       
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
    
}
