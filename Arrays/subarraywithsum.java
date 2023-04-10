package Arrays;
import java.util.*;
public class subarraywithsum {
   public static void subarraysum(int arr[],int n,int sum){
    int count;
    for(int i=0;i<n;i++){
        count=arr[i];
        if(count==sum){
            System.out.println("found at index:"+i);

            return;
        }
        else{
            for(int j=i+1;j<n;j++){
                count+=arr[j];
                if(count==sum){
                    System.out.println("found at indeX:"+i +"&" + j);
                    return;
                }
            }
        }
    }
    System.out.println("not found!");
    return;

}
    public static void main(String[] args) {

        //Input array
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int []arr=new int[n];

        System.out.println("enter array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        
        System.out.println("Enter the sum of the number");
        int sum=sc.nextInt();
        n=arr.length;

        //calling function
        subarraysum(arr,n,sum);
        
    }
}
