import java.util.*;
public class sumOfTwoNum {
    public static int SumofTwo(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=SumofTwo(a, b);
        System.out.println("Sum of Two = "+sum);
    }  
}
