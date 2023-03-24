package Arrays;
import java.util.Scanner;
public class Missing {
    
    public static void main(String[] args) {
    
        int array[]={1 ,2,4,5};
        int n=array.length-2;
        int sumOfAll=(n*(n+1))/2;
        int sumOfArray=0;

        for(int i=0;i<n-2;i++){
            sumOfArray=sumOfArray+array[i];

        }
        int Missing=sumOfAll-sumOfArray;
        System.out.println(Missing);
    
    }
}
