public class updateInArray {
    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[] args) {
        int arr[]={23,45,65};
        update(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        // java me Array call by reference hota hai isliye ye change ho rha hai calling fuction me bhi isme hum original array pass kr rhe hai
        
    }
    
}
