import java.io.*;
import java.io.File;

public class fich_clase2_BufferedWriter {
    public static void main(String[] args) throws IOException {
        //El bufferReader lee por líneas.

        File f = new File("C:\\Users\\AlumnoM\\Desktop\\AD_fich_prueba2.txt");
        BufferedWriter bW = new BufferedWriter(new FileWriter(f));

        bW.write('c');
        bW.write('x');
        //Salto de carro en el fichero, es finolis
        bW.newLine();
        bW.write("String");
        bW.newLine();
        bW.write("alvaro");
        bW.close();

        BufferedReader bR = new BufferedReader(new FileReader(f));

        String linea = "";
        linea = bR.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = bR.readLine();
        }

        bW.close();
    }
}