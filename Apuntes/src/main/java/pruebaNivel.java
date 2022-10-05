import java.util.ArrayList;
import java.util.Scanner;

public class pruebaNivel {

//Crear lista, solicitar números por pantalla de 4 cifras
//En el momento que no ponga un número de 4 cifras,
//la introducción para
//Crear un método que nos permita imprimir un arraylist, va
//a tener un parámetro que nos va a permitir de izquierda a
//derecha y de derecha a izquierda

import java.util.ArrayList;
import java.util.Scanner;

    public class entregaPruebaNivel {
        public static void main(String[] args) {
            ArrayList<Integer> listaNum = new ArrayList<Integer>();
            Scanner sc = new Scanner(System.in);

            System.out.println("Dime números de 4 cifras");
            int numUs = Integer.parseInt(sc.nextLine());

            while (numUs>1000 & numUs<9999){
                listaNum.add(numUs);
                numUs = Integer.parseInt(sc.nextLine());
            }

            System.out.println(listaNum+"Prueba");
            System.out.println("¿Por donde quieres empezar a imprimir?");
            char forma = sc.next().charAt(0);;
            lecturaPantalla(listaNum, forma);
        }

        public static void lecturaPantalla (ArrayList<Integer> listaNum, char forma) {
            if (forma=='a') {
                for (int i = 0; i < listaNum.size(); i++) {
                    System.out.println(listaNum.get(i));
                }
            }
            if (forma=='d') {
                for (int j = listaNum.size() - 1; j >= 0; j--) {
                    System.out.println(listaNum.get(j));
                }
            }
        }


    }


}
