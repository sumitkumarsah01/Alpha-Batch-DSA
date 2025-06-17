public class binarySearch {
    public static int search(int arr[],int key){
        int start=0 ,end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==key){
                return mid;  
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,56,67,78};
        int key =56;
        System.out.println("Index of Given Key : "+search(arr, key));
    }
    
}
