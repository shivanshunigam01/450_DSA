import java.util.*;
public class leftNegative {
    public static void main(String[] args) {
        int arr[]={1,-2,5,4,-9,4,-7,-8,-5,-6};
        int left=0,right=arr.length-1;
        while(left<right){
        while(arr[left]<0){    
        
            left++;
        }
        while(arr[right]>0){
        
            right--;
        }
        while(left>=right){
            break;
        }

        //swap
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+"");
}

    }
    }
 
        
    
        