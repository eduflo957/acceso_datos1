import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/*Crear un fichero con:
string 15 caracteres
1 int
1 caracter
lo leo y luego voy a la posición 3*/

public class fich_clase8_randomFile_ej1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("C:\\Users\\AlumnoM\\Desktop\\fich_clase8_fichRandom_ej1.bin");
        //casa
        //File f = new File("C:\\Users\\Edu guapo\\Desktop\\fich_clase8_fichRandom_ej1.bin");

        RandomAccessFile fA = new RandomAccessFile(f, "rw");
        String palabra = "aaa";
        int TAM = 5;
        char[] arrayPalabra = palabra.toCharArray();
        for (int i = 0; i < TAM; i++) {
            if (i < palabra.length()) {
                fA.writeChar(arrayPalabra[i]);
            } else {
                fA.writeChar('/');
            }
        }
        fA.writeInt(1);
        fA.writeChar('c');

        //fA.seek(0);

        fA.close();

        RandomAccessFile fB = new RandomAccessFile(f, "r");

        try {
            do {
                for (int i = 0; i < arrayPalabra.length; i++) {
                    System.out.print(fB.readChar());
                }
                System.out.print(fB.readInt());
                System.out.print(fB.readChar());
                System.out.println("\n");
            } while (true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}