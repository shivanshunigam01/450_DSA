public class SortColor {
    public static void main(String[] args) {
        int a[]={0,1,0,1,2,0,2,0,1};
        sort012(a, 0);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
 
    public static void sort012(int a[], int n)
    {
        // code here 
        int zero=0, one=0,two=0;
        for(int i =0;i<a.length;i++){
            if(a[i]==0)zero++;
            if(a[i]==1)one++;
            if(a[i]==2)two++;
        }
        //input element
        
        for(int i=0;i<zero;i++){
            a[i]=0;
        }
        for(int i=zero;i<one+zero;i++){
            a[i]=1;
        }
        for(int i=one+zero;i<a.length;i++){
            a[i]=2;
        }
    }
}

