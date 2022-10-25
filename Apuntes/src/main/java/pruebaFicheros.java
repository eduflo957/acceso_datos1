import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class pruebaFicheros {

    public static void main(String[] args) throws IOException {
        FileReader fr1 = new FileReader("C:\\Users\\AlumnoM\\Desktop\\quijote.txt");
        int valor = fr1.read();

        File f1 = new File("C:\\Users\\AlumnoM\\Desktop\\quijoteCifrado.txt");
        FileWriter fw1 = new FileWriter(f1, false);
        while (valor != -1) {
            //System.out.print((char) valor);
            valor = fr1.read();
            fw1.write(cifrar((char) valor));
        }

        char nueva = cifrar('e');
        System.out.println(nueva);
    }


    public static char cifrar(char charFich) {
        char[] arrayVocalesMayus = {'A', 'E', 'I', 'O', 'U'};
        char[] arrayVocalesMins = {'a', 'e', 'i', 'o', 'u'};
        char aux = ' ';

        for (int i = 0; i < arrayVocalesMayus.length; i++) {
            if (charFich == arrayVocalesMayus[i]) {
                if (i == 4) {
                    aux = arrayVocalesMayus[0];
                } else {
                    aux = arrayVocalesMayus[i + 1];
                }
            }

        }
        for (int i = 0; i < arrayVocalesMins.length; i++) {

            if (charFich == arrayVocalesMins[i]) {
                if (i == 4) {
                    aux = arrayVocalesMins[0];
                } else {
                    aux = arrayVocalesMins[i + 1];
                }
            }
        }
        return aux;
    }

}