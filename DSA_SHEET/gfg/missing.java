package gfg;

import java.util.Scanner;


public class missing {
    public static int numberMissing(int array[],int n){
        n=array.length;
        int sumofall=n*(n+1)/2;
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum-array[i];
           
        }
        int missing =sum-sumofall;
       
        return missing;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the array elements:");

        for(int i=0;i<array.length-1;i++){
            array[i]=sc.nextInt();
        }
        sc.close();

    int print=numberMissing(array, size);
    System.out.println(print);

    }
}
