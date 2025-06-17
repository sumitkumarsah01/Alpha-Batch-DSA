public class linearSearch {
    public static int linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={34,56,3,6,89,0};
        int key=6;
        System.out.println("Index of Given Key : "+linear(arr, key));
    }
    
}
