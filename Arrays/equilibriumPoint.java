package Arrays;

public class equilibriumPoint {
    public static void main(String[] args) {
        int array[]={2,5,1,0,3,1,4};
        int rsum=0, lsum=0;
        int n=array.length;
        
        for (int i = 0; i < array.length; i++) {
            rsum+=array[i];

        }

        for (int i = 0; i < array.length; i++) {
            rsum-=array[i];
       
       if(rsum==lsum){
        System.out.println(i);
       }

       lsum+=array[i];

        }


    }
}
