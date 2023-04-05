package Strings;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        
        String str="abcdefghij";
        String rev=" ";
    
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);

        }
        System.out.println(rev);
    }
   
}

