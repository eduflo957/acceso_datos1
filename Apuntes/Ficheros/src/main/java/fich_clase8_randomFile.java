// RandomAccessFile (fichero, modo apertura)
//modo apertura : r #modo lectura
//                rw #modo lectura/escritura
// close()
//seek (bytes), te dice a la posición a la que ir
//length #te dice el tamaño en bytes //aquí se hace lectura fichero sin excepciones
//getFilePointer te dice donde estas en cada momento. //aquí se hace lectura fichero sin excepciones
//Bytes de memoria: Los double 8, int 4, char 2, boolean1, float 4,
//String, num de caracteres por 2


import java.io.*;

public class fich_clase8_randomFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("C:\\Users\\AlumnoM\\Desktop\\fich_clase8_fichRandom.bin");

        //Lectura escritura
        RandomAccessFile fA = new RandomAccessFile(f, "rw");
        fA.writeUTF("aaaaa" + 3000);
        fA.writeInt(1);

        fA.writeUTF("bbbbb");
        fA.writeInt(2);

        //Vuelve a la posición cero, por lo que no hace falta cerrar
        fA.seek(0);

        //fA.close();

        //Solo lectura
        RandomAccessFile fB = new RandomAccessFile(f, "r");

        try {
            do {
                System.out.println(fB.readUTF() + "\n" + fB.readInt());
            } while (true);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}