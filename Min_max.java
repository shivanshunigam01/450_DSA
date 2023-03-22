public class Min_max {

 static void MinMax(int arr[]) 
 {
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
        if(arr[i]>max)
        {
            max=arr[i];
        }
        System.out.println("Minumum"+min);
        System.out.println("Maximum"+max);
    }
}
    
 


    public static void main(String[] args) {
        int arr[]={2,4,8,9,4,1,6,99};
       MinMax(arr);

        }
    }
