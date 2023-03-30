package Arrays;

public class RotateRight {
static void Rotate(int array[],int n,int d) {
    n=array.length;
    d=d%n;

    for(int i=0;i<n;i++){
        if(i<d){
            System.out.print(array[i+n-d]+" ");
        }
        else{
            System.out.print(array[i-d]+" ");
        }
    }

}
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int n=array.length;
        int d=2;
        Rotate(array,n,d);
    }
}
