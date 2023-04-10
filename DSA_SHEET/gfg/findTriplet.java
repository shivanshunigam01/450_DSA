package gfg;
import java.util.*;
import java.util.Scanner;

public class findTriplet {
    public static int Triplet(int array[],int n) {
        Arrays.sort(array);
        int  count=0;
        for(int i=n-1;i>=2;i--){
            int lo=0;
            int hi=i-1;
            while(lo<hi){
                int sum=array[lo]+array[hi];
                if(sum==array[i]){
                    count++;
                    lo++;
                    hi++;
                }
                else if(sum<array[i]){
                    lo++;
                }
                else{
                    hi--;
                }
            }
          
        }
        return count;
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int array[]=new int[size];
        int n=array.length;
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
       
        int result = Triplet(array, n);
        System.out.println(result);
        
        }
    }

