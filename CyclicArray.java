public class CyclicArray {
   public static void main(String[] args) {
    int arra[]={1,2,3,4,5};
    int x=5;
    for(int i=arra.length-1;i>0;i--){

        arra[i]=arra[i-1];
        
    }
      
    arra[0]=x;
  System.out.println(Arrays.toString(arra));
    
}

    
   }
  
