package TwoDarrays.Arrays;
import java.util.*;
public class DiagonalSum {
   public static void main(String[] args) {
    
    int matrix[][]= {{1,2,3},
                    {4,5,6},
                    {1,2,3}};
    int sum=0;
    for(int i=0;i<matrix.length;i++){
        sum+=matrix[i][i];

        if(i!=matrix.length-1-i)
        sum+=matrix[i][matrix.length-i-1];
    }

    System.out.println(sum);




   }

    }


