import java.util.ArrayList;
import java.util.Iterator;

public class collections_clase4 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        /*
         * al.add("Hola"); al.add(true);
         */

        for (Object x : al) {
            System.out.println(x);
        }

        Iterator<Integer> it = al.iterator();
    }}