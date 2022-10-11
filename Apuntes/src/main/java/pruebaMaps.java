import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeSet;

public class pruebaMaps {
/*Tenemos que utilizar hashMap
 * Control de vuelo con <String, Integer> el string es alfanumérico FX378, el integer
 son los minutos de vuelo, por ejemplo, 95
 * Tenemos que hacer un método para añadir un vuelo
 * 			El método me tiene que decir si existe: error, vuelo ya existente (por pantalla)
 * 			Si se introduce el vuelo, no imprime nada, solo se añade a mi hash
 * Método para consultar un vuelo
 * 			El método me tiene que decir error:vuelo no existente (por pantalla)
 * Método para listar los vuelos
 * 			FX378 - 98 minutos (respetando el formato)
 * Hay que ponerlo en el método main
 * 			añadir 6 vuelos nuevos
 * 			intentar añadir un vuelo ya existente
 * 			consultar un vuelo existente
 * 			consultar un vuelo no existente
 * 			hacer listado de vuelos ordenado por vuelo
 * Ninguno de los métodos solicita nada por pantalla
 * En el programa sólo hay una clase hashMap y una clase de la clase list
 */

    public static void main(String[] args) {
        HashMap<String, Integer> vuelos = new HashMap<>();
        pruebaMaps.anyadirVuelo("FX100", 70, vuelos);
        pruebaMaps.anyadirVuelo("FX101", 60, vuelos);
        pruebaMaps.anyadirVuelo("FX102", 50, vuelos);
        pruebaMaps.anyadirVuelo("FX103", 40, vuelos);
        pruebaMaps.anyadirVuelo("FX104", 30, vuelos);
        pruebaMaps.anyadirVuelo("FX105", 20, vuelos);

        System.out.println("parte 1");
        pruebaMaps.anyadirVuelo("FX105", 20, vuelos);

        System.out.println("parte 2");
        pruebaMaps.consultarVuelo("FX105", vuelos);

        System.out.println("parte 3");
        pruebaMaps.consultarVuelo("FX106", vuelos);

        System.out.println("parte 4");
        pruebaMaps.imprimirVuelos(vuelos);
    }

    public static void anyadirVuelo(String vueloNew, Integer tiempoNew, HashMap<String, Integer> vuelos) {
        if (vuelos.containsKey(vueloNew))
            System.out.println("Error, vuelo ya existente");
        else
            vuelos.put(vueloNew, tiempoNew);
    }

    public static void consultarVuelo(String vueloNew, HashMap<String, Integer> vuelos) {
        if (!vuelos.containsKey(vueloNew))
            System.out.println("Error, vuelo no existe");
        else
            System.out.println(vueloNew + " - " + vuelos.get(vueloNew) + " minutos");
    }

    public static void imprimirVuelos(HashMap<String, Integer> vuelos) {
        System.out.println(vuelos);
    }

}