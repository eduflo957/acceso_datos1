import java.io.*;
import java.util.*;

public class fich_clase8_randomFile_rares {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Edu Guapo\\Desktop\\carpetaFicheros\\fichFinal1.bin");
        RandomAccessFile fA = new RandomAccessFile(f, "r");
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        TreeMap<String, Integer> mapa2 = new TreeMap<String, Integer>();

        try {

            do {
                String nacionalidad = "";
                for (int i = 0; i < 20; i++) {
                    nacionalidad += fA.readChar();
                }
                System.out.println(nacionalidad);
                if (mapa.containsKey(nacionalidad)) {
                    mapa.put(nacionalidad, mapa.get(nacionalidad) + 1);
                } else {
                    mapa.put(nacionalidad, 1);
                }
            } while (true);

        } catch (EOFException e) {
            System.out.println("Final de fichero");
        } catch (Exception e) {
            System.out.println(e);
        }

        fA.close();

        mapa2.putAll(mapa);
        for (String nac : mapa2.keySet())
            System.out.println(nac + "" + mapa2.get(nac));
    }
}
