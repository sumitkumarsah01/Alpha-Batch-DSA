
public class calculateBinomialCoefficient {
    public static int fac(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
        
    }

    public static void binomial(int n,int r){
        int factorial_n=fac(n);
        int factorial_r=fac(r);
        int factorial_nMr=fac(n-r);

        int finalAns=factorial_n/(factorial_r*factorial_nMr);
        System.out.println(finalAns);

    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        binomial(n, r);
    }
    
}
