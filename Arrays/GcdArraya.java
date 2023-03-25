package Arrays;
public class GcdArraya{
public static int common(int a,int b){
if(a==0)return b;
if(b==0)return a;

return common(b,a%b);

}
public static int name(int array[], int n) {
    int sum=array[0];
     n=array.length;
    for(int i=0;i<n;i++){
        sum=common(sum,array[i]);
    }
    return sum;
    
}

 
    public static void main(String[] args) {
        int array[]={3,6,9,12,14};
      System.out.println(name(array, 0));  
    }
    
}


