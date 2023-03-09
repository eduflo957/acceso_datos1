/*
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class collectionsEj_1 {

    public static void main(String[] args) {
        ArrayList<Integer> listaNum = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime números de 4 cifras");
        int numUs = Integer.parseInt(sc.nextLine());

        while (numUs > 1000 & numUs < 9999) {
            listaNum.add(numUs);
            numUs = Integer.parseInt(sc.nextLine());
        }

        System.out.println(listaNum + "Prueba");
        System.out.println("¿Por donde quieres empezar a imprimir?");
        char forma = sc.next().charAt(0);
        ;
        // lecturaPantalla(listaNum, forma);

        // imprimirCol(al, 'a');

    }

    */
/*
     * /////////////Probar en casa, la solución está más abajo public static void
     * lecturaPantalla (ArrayList<Integer> listaNum, char forma) { Iterator<Integer>
     * it = listaNum.iterator(); if (forma=='a') { while (it.hasNext()) {
     * System.out.println(it.next()); } } if (forma=='d') { for (it.hasNext()) {
     * System.out.println(it.next()); }
     *
     * } }
     *//*


    public static void imprimirCol(ArrayList<Integer> al, char op) { // revisar, porque me tiene que imprimir de
        // izquierda a derecha y viceversa
        if (al.isEmpty()) {
            System.out.println("Colección vacía");
        } else if (op == 'a') {
            ListIterator<Integer> li = al.listIterator();
            do {
                System.out.println(li.next());
            } while (li.hasNext());
        } else {
            ListIterator<Integer> li = al.listIterator(al.size());
            do {
                System.out.println(li.previous());
            } while (li.hasPrevious());
        }

    }
}
*/
