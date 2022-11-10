import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class fich_clase1_FileWriter {
    public static void main(String[] args) throws IOException {
        //Creo un fichero y lo pongo en la ruta
        //TODO Este lee caracter por caracter
        //File (String directorio, String nombre_fichero o nombre_directorio) - Normal
        //Clase
        //File f1 = new File("C:\\Users\\AlumnoM\\Desktop\\AD_fich_prueba1.txt");
        //Casa
        File f1 = new File("C:\\Users\\Edu guapo\\Desktop\\carpetaFicheros\\AD_fich_prueba1.txt");
        //System.out.println((f1.getName())); //te da el nombre del fichero
        //File (File directorio, String nombre_fichero o nombre_directorio) - revisa porque es objeto
        //File f2 = new File ("C:\\Users\\AlumnoM\\Desktop","fichero.txt");
        //Como cada sistema operativo utiliza diferente separador, puede meter:
        //File f3 = new File ("C:"+File.separator+"Users"+File.separator+"AlumnoM"+File.separator+"Desktop"+File.separator+"fichero.txt");

        //Método writer (char)
        //Método write (char[] arr)

        FileWriter fw1 = new FileWriter(f1, false);
        //TODO MEJOR PONER SIEMPRE TRUE/FALSE, para evitar errores
        //Modo machaque:
        //FileWriter fw1 = new FileWriter(f1,false);
        //Modo respetar el fichero:
        //FileWriter fw1 = new FileWriter(f1,true);

        fw1.write(('c'));
        fw1.append('x');
        fw1.write('1');

        fw1.close();

        //Un fichero se lee así
        FileReader fr1 = new FileReader("C:\\Users\\Edu guapo\\Desktop\\carpetaFicheros\\AD_fich_prueba1.txt");
        int valor = fr1.read();
        //el -1 indica hasta final de fichero
        while (valor != -1) {
            System.out.print((char) valor);
            valor = fr1.read();
        }


        int car = 0;
        char arr[] = new char[3];
        car = fr1.read(arr);
        while (car != -1) {
            System.out.print((char) car);
            car = fr1.read(arr);
        }

        //Hay que cerrar siempre el fichero por precaución
        fw1.close();
    }

}
