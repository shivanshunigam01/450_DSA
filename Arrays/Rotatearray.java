package Arrays;
public class Rotatearray {

public static void rotate(int array[],int d,int n){
    int temp[]= new int[n];
    int k=0;
    for(int i=d;i<n;i++){
        temp[k]=array[i];
        k++;
    }

    for(int i=0;i<d;i++){
        temp[k]=array[i];
        k++;
    }
for(int i=0;i<n;i++){
    array[i]=temp[i];
}


for(int i=0;i<n;i++){
    System.out.print(array[i]+" ");

}


}


    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7};
        int d=5;
        int n=array.length;
        rotate(array, d, n);

    }
    
}
