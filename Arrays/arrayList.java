package Arrays;
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> old =new ArrayList<>();
        old.add(1);
        old.add(10);
        old.add(100);
        old.add(1000);
        old.add(10000);
        old.add(100000);
        System.out.println(old);

        old.remove(2);
        System.out.println(old);
        
        

        old.get(1);
        System.out.println(old);

        old.add(0, 0);
        System.out.println(old);
    }
}
