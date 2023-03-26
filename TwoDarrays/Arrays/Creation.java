package TwoDarrays.Arrays;
import java.util.Scanner;
public class Creation {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int row=3;
        int col=3;
        Scanner sc= new Scanner(System.in);
//INPUT
            System.out.println("This is the ouptut:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }

        }
//OUTPUT
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            
System.out.print( matrix[i][j]+" ");
                          }

                          System.out.println();
    
    
    }
    }
}
