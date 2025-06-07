public class primeOrNot {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
           boolean result = isPrime(i);
           if(result==true){
            System.out.println(i);
           }
        }
    }
    
}













/*import java.util.Scanner;

public class PrimeCheck {

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }
        if (num == 2) {
            return true; // 2 is prime
        }
        if (num % 2 == 0) {
            return false; // even numbers other than 2 are not prime
        }

        // Check divisibility till square root of num
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false; // divisible by some number other than 1 and itself
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }

        sc.close();
    }
}  */

