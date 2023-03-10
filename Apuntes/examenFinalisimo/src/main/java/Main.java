import java.io.*;
import java.util.*;

public class Main {
    public static <excepcion extends Throwable, exception extends Throwable> void main(String[] args) throws IOException {
        System.out.println("Empieza programa");

        //Casa
        //File f = new File("C:\\Users\\Edu guapo\\Desktop\\carpetaFicheros\\fichFinal1.bin");

        //Clase
        File f = new File("C:\\Users\\AlumnoM\\Desktop\\carpetaFicheros\\fichFinal1.bin");

        //Lectura escritura -> rw
        RandomAccessFile fichWork = new RandomAccessFile(f, "rw");
        fichWork.writeUTF("aaaaa");
        fichWork.writeUTF("edu");
        fichWork.writeUTF("pepe");
        fichWork.writeUTF("edu");
        fichWork.writeUTF("pepe");
        fichWork.writeUTF("edu");
        fichWork.writeUTF("jose");
        fichWork.writeUTF("jose");
        fichWork.writeUTF("edu");
        fichWork.writeUTF("luisa");

        //Sin repetido
        HashSet<String> nombreIndividual = new HashSet<>();
        //todos los elementos
        ArrayList<String> arrayNombres = new ArrayList<>();
        //Diccionario
        HashMap<String, Integer> dic = new HashMap<>();
        String nombre = "";

        fichWork.seek(0);

        try {
            do {
                nombre = fichWork.readUTF();
                arrayNombres.add(nombre);
                nombreIndividual.add(nombre);
                //System.out.println(nombre);
            } while (true);
        } catch (Exception e) {
            System.out.println(e);
        }

        fichWork.close();

        int cont;
        for (String x : nombreIndividual) {
            cont = 0;
            System.out.println(x);
            for (String y : arrayNombres) {
                System.out.println(y);
                if (x.equals(y)) {
                    cont += 1;
                }
            }
            dic.put(x, cont);
        }

        System.out.println("\nmapaimpreso");
        for (Map.Entry impMapa : dic.entrySet()) {
            System.out.println(impMapa.getKey()+ ": " +impMapa.getValue());
        }

        TreeMap<String, Integer> mapaOrdenado = new TreeMap<>();
        mapaOrdenado.putAll(dic);
        System.out.println(mapaOrdenado);/*
        for (Map.Entry impMapa : dic.entrySet()) {
            mapaOrdenado.put((Integer) impMapa.getValue(), (String) impMapa.getKey());
        }*/

        /*
        System.out.println("\nmapaimpreso*****Ordenado");
        for (Map.Entry impMapa : mapaOrdenado.entrySet()) {
            System.out.println(impMapa.getValue()+ ": " +impMapa.getKey());
        }*/
        System.out.println("Pruebaaaaaaaaaaaaaaaaaaas");
        System.out.println(arrayNombres.size());



    }
}
