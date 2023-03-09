import java.util.LinkedList;

public class collections3_LinkedList {
    public static void main(String[] args) {
        //Es una lista que te permite utilizar iterador
        //mejor no utilizar porque no la conoces muy bien
        LinkedList<Integer> listaInt = new LinkedList<Integer>();
        listaInt.add(1);
        listaInt.add(2);
        listaInt.add(3);

        System.out.println(listaInt.getLast());
        listaInt.addFirst(0);
        System.out.println("Probando addFirst: "+listaInt);
        listaInt.addLast(35);
        System.out.println("Probando addLast: "+listaInt);

        LinkedList<String> listaString = new LinkedList<>();
        listaString.add("Perro");
        listaString.add("gato");
        listaString.add("pajaro");
        listaString.add("tortu");

        System.out.println(listaString);
        //Podemos coger el elemento que queramos con la posición get()
        System.out.println("con el get: "+listaString.get(0));

        //Para sacar elemento por elemento mejor un for each de este tipo:
        System.out.println("Vamos a probar bucles: ");
        for (String x: listaString) {
            System.out.println(x);
        }

    }

}
