public class palindromOrNot {
    public static boolean checkPlaindrom(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str="racecar";

        if(checkPlaindrom(str)==true){
            System.out.println("Given String is palindrom");
        }
        else{
             System.out.println("Given String is not palindrom");
        }
        
    }
    
}
