import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class collections_clase1 {

    public static void main(String[] args) {

        HashSet<Integer> hS = new HashSet<Integer>();
        hS.add(1);
        hS.add(1);
        hS.add(3);

        imprimirCol(hS);

        HashSet<String> hSString = new HashSet<String>();
        hSString.add("hola");
        hSString.add("hola");
        hSString.add("adios");

        imprimirColString(hSString);

    }

    //Imprimir sin numeros duplicados
    public static void imprimirCol(Collection<Integer> col) { // revisar, porque me tiene que imprimir de
        if (col.isEmpty()) {
            System.out.println("Colección vacía");
        } else {
            Iterator<Integer> li = col.iterator();
            do {
                System.out.println(li.next());
            } while (li.hasNext());

        }
    }

    //Imprimir sin palabras duplicadas
    public static void imprimirColString(Collection<String> col) { // revisar, porque me tiene que imprimir de
        if (col.isEmpty()) {
            System.out.println("Colección vacía");
        } else {
            Iterator<String> li = col.iterator();
            do {
                System.out.println(li.next());
            } while (li.hasNext());

        }
    }
}