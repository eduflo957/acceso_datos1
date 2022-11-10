/*
la clase objectoutputStream está definida por java
con la clase write streamHeader, cuando llamo a object,
me escribe la cabecera,
pero si el fichero existe,
Si el fichero NO existe, llamaría a mi object,
Pero si existe, llamaré a mi clase para que imprima sin cabecera
*/

import java.io.*;

//TODO para escirbir/leer un fichero binario, va junto al doc: fich_clase6_ej1_profe
public class fich_clase6_ej1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Clase
        File f = new File("C:\\Users\\AlumnoM\\Desktop\\fich_clase6_ej1.bin");
        //Casa
        //File f = new File("C:\\Users\\Edu guapo\\Desktop\\carpetaFicheros\\fich_clase6_ej1.bin");

        ObjectOutputStream fO = null;

        if (f.exists())
            fO = new fich_clase6_ej1_profe(new FileOutputStream(f,true));
        else
            fO = new ObjectOutputStream(new FileOutputStream(f));

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