/*crear fichero codificado;
 * cada vocal tiene que ser la siguiente;
 * La a, es e, la e es i, la i es o, etc
 * sin tildes pero las minusculas y mayusculas se respeta
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//1 posibilidad: Hacer 2 arrays y comparar así
//AEIOUaeiou
//EIOUAeioua

//2 posibilidad: hacer una cadena y utilizar index
//ordenada = "AEIOUaeiou"
//codificada = "EIOUAeioua"
// if "AEIOUaeiou".index(car) = -1 //(es decir, no lo encuentra)
        //write(fichero) (es decir, no es vocal, escribo
// else
        //ver la posicion
        //write (fichero.index(posicion))

public class pruebaFicheros {
    public static void main(String[] args) throws IOException {
        //Clase
        FileReader fr1 = new FileReader("C:\\Users\\AlumnoM\\Desktop\\quijote.txt");
        //Casa
        //FileReader fr1 = new FileReader("C:\\Users\\Edu guapo\\Desktop\\quijote.txt");
        int valor = fr1.read();

        //Clase
        File f1 = new File("C:\\Users\\AlumnoM\\Desktop\\quijoteCifrado.txt");
        //Casa
        //File f1 = new File("C:\\Users\\Edu guapo\\Desktop\\quijoteCifrado.txt");
        FileWriter fw1 = new FileWriter(f1, false);
        while (valor != -1) {
            //System.out.print((char) valor);
            fw1.write(cifrar((char) valor));
            valor = fr1.read();
        }

        char nueva = cifrar('a');
        //System.out.println(nueva);
        fw1.close();
    }


    public static char cifrar(char charFich) {
        char[] arrayVocalesMayus = {'A', 'E', 'I', 'O', 'U'};
        char[] arrayVocalesMins = {'a', 'e', 'i', 'o', 'u'};
        char aux = ' ';

        for (int i = 0; i < arrayVocalesMayus.length; i++) {
            if (charFich == arrayVocalesMayus[i]) {
                if (i == 4) {
                    charFich = arrayVocalesMayus[0];
                } else {
                    aux = arrayVocalesMayus[i + 1];
                }
            } else {
                aux = charFich;
            }

        }
        for (int i = 0; i < arrayVocalesMins.length; i++) {

            if (charFich == arrayVocalesMins[i]) {
                if (i == 4) {
                    charFich = arrayVocalesMins[0];
                } else {
                    aux = arrayVocalesMins[i + 1];
                }
            } else {
                aux = charFich;
            }
        }
        return aux;
    }

}
