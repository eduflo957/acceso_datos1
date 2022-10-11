import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class hashMap_casa {

    /**
     * @param args
     * @author Wentasy
     * @desde el 23 de abril de 2012 17:36:53
     * Dada cualquier cadena "hoy es un día especial",
     * La longitud es arbitraria, se requiere para encontrar el personaje con más ocurrencias y el número de cálculos.
     * (Se puede implementar con HashMap, HashSet, Collections)
     */
    public static void main(String[] args) {
        countChar();
    }

    public static void countChar() {
        Scanner scan = new Scanner(System.in); // Construye el flujo de entrada
        String str = ""; // Acepta la entrada de cadena desde el teclado
        System.out.println("Ingrese una línea de cadenas:");
        // str = scan.next (); // Nota: Use el siguiente método si la cadena que ingresa incluye espacios, obtendrá resultados incorrectos
        str = scan.nextLine();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>(); // Crear un objeto HashMap

        for (int i = 0; i < str.length(); i++) {
            Character ch = new Character(str.charAt(i)); // Intercepta el personaje en la posición i-ésima
            Integer val = new Integer(1); // Una variable que registra el número de ocurrencias
            Integer oldVal = map.put(ch, val); // Coloque el número de ocurrencias en el Mapa
            // el método put devuelve el valor anterior asociado con la clave; si la clave no tiene asignación, devuelve nulo. (Devolver nulo también puede indicar que el mapeo previamente asociado era nulo con la clave).
            if (oldVal != null) {
                map.put(ch, oldVal + 1); // Si no está vacío, coloque el dedo antiguo más 1 en el Mapa
            }
        }

        System.out.println(map); // Imprime la relación de mapeo entre los caracteres almacenados y las ocurrencias
        int max = 0; // El número máximo de ocurrencias
        Character ch1 = null; // Graba el personaje con más ocurrencias
        Set<Character> set = new HashSet<Character>(); // Crear un objeto Set
        Iterator<Character> it = map.keySet().iterator(); // Obtener el iterador del objeto Set
        while (it.hasNext()) {
            Character ch = (Character) it.next(); // Obtener elementos
            Integer pos = map.get(ch).intValue(); // Buscar valor por clave
            // Compare uno por uno para encontrar los caracteres y ocurrencias más frecuentes
            if (pos > max) {
                max = pos;
                ch1 = ch;
            }
        }

        // Imprime el resultado
        System.out.println("String" + str + "Los caracteres más frecuentes son:" + ch1 + "\n" + "El número de ocurrencias es:" + max);
        ;
    }
}