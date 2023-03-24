package Arrays;
import java.util.Scanner;
public class Repatarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array!");
        int n=sc.nextInt();
        int array[]=new int[n];
       int max=array.length;
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            
        // System.out.print("The array is"+array[i]);
        }

        //Repeat array

        for(int i=0;i<max-1;i++){
            if(array[i]==array[i+1]){
            // System.out.println(array[i]);

            System.out.println(+array[i]);
            }
            
        }
    }
}
