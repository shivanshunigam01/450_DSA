package gfg;

public class Kadanes {
    public static int maxSum(int array[],int n){
        int maxsum=0;
        int currentsum=0;
        for(int i=0;i<n;i++){
            currentsum=currentsum+ array[i];{
                if(currentsum>maxsum){
                    maxsum=currentsum;
                }
             if(currentsum<0){
                    maxsum=0;
                }
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,-2,5};
        int n=array.length;
        System.out.println(maxSum(array, n));
        // maxSum(array, n);
        
    }
}
