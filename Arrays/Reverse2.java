package Arrays;

 public class Reverse2{

    public static void ReverseArr(int num[]) {
        int n=num.length;
        for(int i=0;i<n/2;i++){
            //swap
            int temp=num[i];
            num[i]=num[n-1-i];
            num[n-i-1]=temp;
            
        }
        
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,9};
        ReverseArr(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
  

    }

}