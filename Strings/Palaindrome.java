package Strings;
import java.util.*;

class Palaindrome{


    public static boolean IsPalindrome(String str){
        int n=str.length();

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(n-1-i)){
                return true;
            }
           

        }

        return false;
    
       
    }
    
    public static void main(String[] args) {
        String str="NOON";
        // IsPalindrome(str);
        System.out.println(IsPalindrome(str));
       
    
}
}