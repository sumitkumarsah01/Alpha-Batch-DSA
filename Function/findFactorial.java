import java.util.*;
public class findFactorial {
    public static void factorial(int a){
        int fac=1;
        for(int i=1;i<=a;i++){
            fac=fac*i;
        }
        System.out.println(fac);
    }
    public static void main(String[] args) {
        int a=5;
        factorial(a);
    }
    
}
