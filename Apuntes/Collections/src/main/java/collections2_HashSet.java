import java.util.HashSet;

public class collections2_HashSet {

    public static void main(String[] args) {
        //HashSet es una lista que te quita los datos repetidos
        //No garantiza que los datos se mantengan ordenados
        HashSet<Integer> hS = new HashSet<Integer>();
        hS.add(1);
        hS.add(1);
        hS.add(3);
        System.out.println(hS);
        System.out.println("Probando métodos: "+hS.clone());
        //Si contiene algún dato: .contains(dato)

        HashSet<String> hSString = new HashSet<String>();
        hSString.add("hola");
        hSString.add("hola");
        hSString.add("adios");
        System.out.println(hSString);

        //Para sacar elemento por elemento mejor un for each de este tipo:
        System.out.println("Vamos a probar bucles: ");
        for (String x: hSString) {
            System.out.println(x);
        }

    }

    /*********************** MÉTODOS QUE NO SIRVEN PARA UNA MIERDA ************************
    //Imprimir sin numeros duplicados
    public static void imprimirCol(Collection<Integer> col) { // revisar, porque me tiene que imprimir de
        if (col.isEmpty()) {
            System.out.println("Colección vacía");
        } else {
            Iterator<Integer> li = col.iterator();
            do {
                System.out.println(li.next());
            } while (li.hasNext()); //mientras haya hash porque: li.hasNext es true,
            // si es false es que no hay más hash

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
    } */
}