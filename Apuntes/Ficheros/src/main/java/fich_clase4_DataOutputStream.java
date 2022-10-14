import java.io.*;

//writeUTF(String)
//writeInt
public class fich_clase4_DataOutputStream {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\AlumnoM\\Desktop\\ficheroPruebaAccesoDatos.bin");
        DataOutputStream dO = new DataOutputStream(new FileOutputStream(f, false));

        dO.writeUTF("Hola");
        dO.writeInt(100);

        dO.close();

        DataInputStream dI = new DataInputStream(new FileInputStream(f));

        try {
            do {
                System.out.println(dI.readUTF());
                System.out.println(dI.readInt());
            } while (true);
        } catch (EOFException e) {
            System.out.println("Fin fichero");
        }
        dO.close();
    }
}
