package Arrays;
class Intersection{
public static void Intersection(int array1[],int array2[]) {
    for(int i=0;i<array1.length-1;i++){
        for(int j=0;j<array2.length-1;j++){
            if(array1[i]==array2[j]){
                System.out.println(array1[i]);
            }
        }
        
    }
   

}
public static void main(String[] args) {
    int array1[]={2,4,5,8,1,7};
    int array2[]={4,5,8,1,11,45};
    // Intersection(array1, array2);
    System.out.print("The same element is:");
    Intersection(array1, array2);

}
}
