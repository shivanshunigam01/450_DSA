package Arrays;

public class LargestValue {
    public static int largest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }

        }
        return largest;
    }
    public static void main(String[] args) {
    int numbers[]={2,5,6,8,9,120};    
    System.out.println("the largest number is :"+largest(numbers));
    }
}
