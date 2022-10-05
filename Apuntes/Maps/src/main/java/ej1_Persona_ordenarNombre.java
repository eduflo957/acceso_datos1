import java.util.ArrayList;
import java.util.Collections;

/**Creamos un arrayllist de personas
 * ordenmos las personas en base al nombre
 * ver si un objeto está dentro del array
 */

public class ej1_Persona_ordenarNombre {
    public static void main(String[] args) {
        ArrayList<ej1_Persona> arrayPersonas = new ArrayList<>();

        arrayPersonas.add(new ej1_Persona(10, "pepe"));
        arrayPersonas.add(new ej1_Persona(12, "edu"));
        arrayPersonas.add(new ej1_Persona(14, "anto"));

        System.out.println("Desordenado: " + arrayPersonas);

        Collections.sort(arrayPersonas);
        System.out.println("Ordenado: " + arrayPersonas);
    }
}

