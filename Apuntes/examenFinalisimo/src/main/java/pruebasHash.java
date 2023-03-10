import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class pruebasHash {
    public static void main(String[] args) throws IOException {
        System.out.println("Empieza programa");

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Edu", 1);
        hm.put("Paco", 6);
        hm.put("Paco", 5);
        hm.put("Edu", 5);

        LinkedHashSet<String> listaLlave = new LinkedHashSet<>();
        LinkedHashSet<Integer> listaValor = new LinkedHashSet<>();

        for (Map.Entry x : hm.entrySet()) {
            listaLlave.add(x.getKey().toString());
            listaValor.add(Integer.valueOf(x.getValue().toString()));
        }

        for (Map.Entry x : hm.entrySet()) {
            System.out.println(x.getKey());
            System.out.println(x.getValue());
        }
    }

}

