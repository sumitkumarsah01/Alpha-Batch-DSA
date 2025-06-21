public class bubbleSort {
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swaped=0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaped++;
                }
            }
            if(swaped==0){
                return;
            }
        }
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        bubble(arr);
        printarr(arr);
    }
    
}
