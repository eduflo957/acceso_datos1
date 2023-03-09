import java.util.HashSet;
import java.util.Scanner;

public class collectionsEj_2 {

/*Pido animales por pantalla, valen repetidos, hasta que el usuario introduce FIN o fin
 * Animal
 * Pulpo
 * Animal
 * Tigre
 * Animal
 * Ballena
 * Animal
 * Tigre
 * Animal
 * Oso
 * Animal
 * Pulpo
 * Animal
 * FIN
Al final hay que decir "animales repetidos = los que haya"
Podemos utilizar ArrayList, HashSet,
*/

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Animal: ");
            HashSet<String> hashAnimales = new HashSet <String> ();
            String animalPantalla = " ";
            animalPantalla = sc.next();
            int cont = 0;
            int i = 0;
            while (!animalPantalla.toUpperCase().equals("FIN")) {
                hashAnimales.add(animalPantalla);
                cont = i++;
                System.out.println("Animal: ");
                animalPantalla = sc.next();
            };

            if (cont!=0) {
                cont = cont+1;
            }

            int animalesRepetidos = cont - hashAnimales.size();
            System.out.println("Animales repetidos: "+animalesRepetidos);
        }
    }

