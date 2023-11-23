import java.util.ArrayList;

public class Testing {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        int i = 12;
        Integer iObj;



        al.add(Integer.valueOf(100));  // 1
        al.add(25);                // 2
        al.add(i);                 // 3
        i = al.remove(0);          // 4
        iObj = al.remove(0);       // 5

    }
}