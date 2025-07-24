public class BitwiseOperator{
    public static void And(){
        //AND Operator
       System.out.println(0 & 0);
       System.out.println(0 & 1);
       System.out.println(1 & 0);
       System.out.println(1 & 1);

    }
    public static void or(){
       System.out.println(0 | 0);
       System.out.println(0 | 1);
       System.out.println(1 | 0);
       System.out.println(1 | 1);

    }
    public static void Xor(){
       System.out.println(0 ^ 0);
       System.out.println(0 ^ 1);
       System.out.println(1 ^ 0);
       System.out.println(1 ^ 1);
    }
    public static void compliment1s(){
        System.out.println(~0);
        System.out.println(~1);
    }

    public static void leftshift(){
        System.out.println(5<<2);
    }
    public static void rightshift(){
        System.out.println(5>>2);
    }
    public static void main(String[] args) {
        //AND Operator
        And();
        //OR
        or();
        //XOR
        Xor();
        //1's compliment
        compliment1s();
       // left shift 
       leftshift();
       //right shift
       rightshift();

        
    }
    
}
