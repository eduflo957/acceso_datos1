/*
la clase objectoutputStream está definida por java
con la clase write streamHeader, cuando llamo a object,
me escribe la cabecera,
pero si el fichero existe,
Si el fichero NO existe, llamaría a mi object,
Pero si existe, llamaré a mi clase para que imprima sin cabecera
*/

import java.io.*;

public class fich_clase6_ej1 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\AlumnoM\\Desktop\\doc_objUs_ej1.bin");

        ObjectOutputStream fO = new ObjectOutputStream(new FileOutputStream(f, true));
        fO.writeObject("Primero");
        fO.writeObject("Segundo");

        fO.close();

        ObjectInputStream fI = null;
        try {
            fI = new ObjectInputStream(new FileInputStream(f));
            do {
                System.out.println(fI.readObject());
            } while (true);
        } catch (Exception e) {
            System.out.println(e);
        }

        fI.close();
    }
}

/*
miClase extends objectOutPutStream
    miClase (-----------)
        super c

        llamo a writeStreamHeader
 */