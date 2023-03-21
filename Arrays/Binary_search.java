package Arrays;

public class Binary_search {
    public static int BinarySearch(int number[],int key){
       int start=0;
       int end=number.length-1;

       while(start<=end){
        int mid=(start+end)/2;
        
        //compare
        if(number[mid]==key){
            return mid;
        }
        if(number[mid]<key){
            start+=1;
        }
        else{
            end=mid-1;
        }
    
    }

    return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,5,8,69,1,0};
        int key=69;
        System.out.println("Key found at the index:"+BinarySearch(number, key));
    }
}
