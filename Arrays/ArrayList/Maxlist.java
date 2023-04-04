package Arrays.ArrayList;
import java.util.*;
public class Maxlist {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList();
        List.add(1);
        List.add(2); 
        List.add(6);
        List.add(4);
        List.add(5);
        List.add(1);
        Collections.sort(List);
        System.out.println(List);

        int Max=Integer.MIN_VALUE;

        for(int i=0;i<List.size();i++){
            if(Max<List.get(i)){
              Max=List.get(i);

            }
           
         
        }

        System.out.println("Maximum element is "+Max);

    }
}

