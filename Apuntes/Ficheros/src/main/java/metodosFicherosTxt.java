import java.io.*;

public class metodosFicherosTxt {
    public static void main(String[] args) throws IOException {
        String texto = "En un lugar de la mancha";
        escribirFicheroChar("C:\\Users\\Edu guapo\\Desktop\\carpetaFicheros\\writeReadChar.txt", texto, true);
        char[] frase = leerFicheroChar("C:\\Users\\Edu guapo\\Desktop\\carpetaFicheros\\writeReadChar.txt");
        System.out.println(frase);
    }

    public static void escribirFicheroChar(String ruta, String texto, boolean machaque) throws IOException {
        File f1 = new File(ruta);
        FileWriter fw1 = new FileWriter(f1, machaque);
        char[] arrayString = texto.toCharArray();
        for (int i = 0; i < arrayString.length; i++) {
            fw1.write(arrayString[i]);
        }
        //El close también guarda, parece
        fw1.close();
        //true respeta, false machaca
    }

    public static char[] leerFicheroChar(String ruta) throws IOException {
        FileReader fr1 = new FileReader(ruta);
        int valor = fr1.read();
        int cont = 0;
        //el -1 indica hasta final de fichero
        while (valor != -1) {
            //System.out.print((char) valor);
            cont += 1;
            valor = fr1.read();
        }
        fr1.close();
        FileReader fr2 = new FileReader(ruta);
        int letra = fr2.read();
        char[] arrayString = new char[cont];
        for (int i = 0; i < cont; i++) {
            arrayString[i] = (char) letra;
            letra = fr2.read();
        }
        return arrayString;
    }


}
