import java.io.*;
//TODO para escirbir/leer un fichero binario, va junto al doc: fich_clase6_ej1_profe
//Esta vez leemos objetos

public class fich_clase7_Fichero {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Clase
        File f = new File("C:\\Users\\AlumnoM\\Desktop\\doc_objUs_clase7.bin");
        //Casa
        //File f = new File("C:\\Users\\Edu guapo\\Desktop\\carpetaFicheros\\doc_objUs_clase7.bin");

        ObjectOutputStream fO = null;

        if (f.exists())
            fO = new fich_clase6_ej1_profe(new FileOutputStream(f, true));
        else
            fO = new ObjectOutputStream(new FileOutputStream(f));

        //TODO Hay 2 formas de escribir:
        //Esta es por partes
        fich_clase7_Persona p1 = new fich_clase7_Persona ("PEPE", 15);
        fO.writeObject(p1);
        //Esta es simplificando el código
        fO.writeObject(new fich_clase7_Persona("Eva",19));

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
