import java.util.HashMap;
import java.util.Map.Entry;

public class hashMap_Manue {
    public static void main(String[] args) {
        HashMap<Integer, Persona> hm = new HashMap<>();
        hm.put(10, new Persona("Paco"));
        hm.put(34, new Persona("Paca"));
        hm.put(66, new Persona("Jose Antonio"));
        hm.put(91, new Persona("Maricarmen"));
        for (Entry<Integer, Persona> entry : hm.entrySet()) {
            System.out.println(entry);
            //para recorrer la hashMap devolviendo solo valores.
            System.out.println(entry.getValue());
        }
        for (Entry<Integer, Persona> entry : hm.entrySet()) {
            Integer key = entry.getKey();
            Persona val = entry.getValue();
            System.out.println(entry);
        }

        System.out.println(hm.get(10));
    }
}


class Persona {
    String nombre;


    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + "]";
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}