public class largestElement {
    public static void find(int arr[]){
        int element=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>element){
                element=arr[i];
            }

        }
        System.out.println(element);
    }
    public static void main(String[] args) {
        int arr[]={100,54,2,6,78,89};
        find(arr);
    }
    
}
