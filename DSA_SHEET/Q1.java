class Q1{
   
public static void swap (int array[],int n) {
        
        for(int i=0;i<n/2;i++){
            int temp=array[i];
            array[i]=array[n-1-i];
            array[n-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        int n=array.length;
        swap(array, n);
        for(int i=0;i<n;i++){
            System.out.print(array[i]);
        }

    }
}
