public class linearSearch {
    public static void linear(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.print("this is location of finding element ="+i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={34,56,3,6,89,0};
        int num=3;
        linear(arr, num);
    }
    
}
