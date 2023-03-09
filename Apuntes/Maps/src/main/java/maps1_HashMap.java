import java.util.HashMap;
import java.util.Map;

public class maps1_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, Persona> hm = new HashMap<>();
        hm.put(10, new Persona("Paco"));
        hm.put(34, new Persona("Paca"));
        hm.put(66, new Persona("Jose Antonio"));
        hm.put(91, new Persona("Maricarmen"));
        for (Map.Entry<Integer, Persona> entry : hm.entrySet()) {
            System.out.println(entry);
            //para recorrer la hashMap devolviendo solo valores.
            System.out.println(entry.getValue());
        }
        for (Map.Entry<Integer, Persona> entry : hm.entrySet()) {
            Integer key = entry.getKey();
            Persona val = entry.getValue();
            System.out.println(entry);
        }

        System.out.println(hm.get(10));
    }
}
