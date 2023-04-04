package Arrays.ArrayList;
import java.util.*;

import Arrays.arrayList;
public class ListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList();
        List.add(1);
        List.add(2); 
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        System.out.println(List);


            //Get
        System.out.println(List.get(4));

        //Remove
        System.out.println(List.remove(4));
    
        //contains
        System.out.println(List.contains(6)); //if yes returns true else false; 


        //print array list 

        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i));
        }
    }
}
