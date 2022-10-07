import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fich_clase1 {
    public static void main(String[] args) throws IOException {
        //Creo un fichero y lo pongo en la ruta
        //File (String directorio, String nombre_fichero o nombre_directorio) - Normal
        File f1 = new File ("C:\\Users\\AlumnoM\\Desktop\\AD_fich_prueba1.txt");
        //System.out.println((f1.getName())); //te da el nombre del fichero
        //File (File directorio, String nombre_fichero o nombre_directorio) - revisa porque es objeto
        //File f2 = new File ("C:\\Users\\AlumnoM\\Desktop","fichero.txt");
        //Como cada sistema operativo utiliza diferente separador, puede meter:
        //File f3 = new File ("C:"+File.separator+"Users"+File.separator+"AlumnoM"+File.separator+"Desktop"+File.separator+"fichero.txt");

        //Método writer (char)
        //Método write (char[] arr)

        FileWriter fw1 = new FileWriter(f1);
        //Modo machaque:
        //FileWriter fw1 = new FileWriter(f1,false);
        //Modo respetar el fichero:
        //FileWriter fw1 = new FileWriter(f1,true);

        fw1.write(('c'));
        fw1.append('x');

        fw1.close();
    }

}
