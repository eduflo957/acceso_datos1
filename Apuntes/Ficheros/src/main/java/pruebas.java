import java.io.*;

//5-20-5-3
/*
 * Trenes.dat
 * Nombre del tren: String 5 limite
 * Nombre destino: String 20 limite
 * Hora: String 5 límite
 * Numero de reservas: Short
 *
 * Reservas.dat
 * 5
 * Numero de reservas disponibles: Short
 */

public class pruebas {
    public static void main(String[] args) throws IOException {
        File fich = new File("C:\\Users\\Edu Guapo\\Desktop\\carpetaFicheros\\trenes.dat");
        RandomAccessFile fichRead = new RandomAccessFile(fich, "r");
        int i = 0;
        String id = " ";
        String destino = " ";
        String hora = " ";
        boolean flag = false;

        try {
            do {
                for (i = 0; i < 5; i++) {
                    id += fichRead.readChar();
                }
                for (i = 0; i < 20; i++) {
                    destino += fichRead.readChar();
                }
                for (i = 0; i < 5; i++) {
                    hora += fichRead.readChar();
                }
                short numReservas = fichRead.readShort();

                System.out.println(id + " " + destino + " " + hora + " " + numReservas);

            } while (flag);
        } catch (Exception e) {
            System.out.println("Final de fichero");
        }
    }
}

