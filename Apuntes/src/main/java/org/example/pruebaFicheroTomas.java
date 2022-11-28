package org.example;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

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

public class pruebaFicheroTomas {
    public static void main(String[] args) throws IOException {
        String id = "";
        String hora = "";
        short capMax = 0, cap = 0, capRest = 0;
        boolean flag = false;

        File f1 = new File("C:\\Users\\Edu guapo\\Desktop\\carpetaFicheros\\trenes.dat");
        RandomAccessFile fR1 = new RandomAccessFile(f1, "r");
        File f2 = new File("C:\\Users\\Edu guapo\\Desktop\\carpetaFicheros\\reservas.dat");
        RandomAccessFile fR2 = new RandomAccessFile(f2, "r");

        System.out.println("Plazas libres:");

        try {
            //Bucle infinito hasta que termine de leer el trenes.dat (ese "hasta" no está en este bucle si no en la excepción)
            do {
                //Ponemos id y hora a blanco y flag a true en cada vez que se haga el bucle de nuevo para que tome los datos bien
                id = "";
                hora = "";
                flag = true; //Este flag sirve para el do-while que estará dentro del try catch del archivo reservas.dat

                //Aqui concatenamos cada letra de la id en una string
                for (int i = 0; i < 5; i++) {
                    id = id + fR1.readChar();
                }

                //Creamos el nombre del trayecto
                String trayecto = "";

                //Leemos letra por letra el trayecto y lo guardamos en la variable suya
                for (int i = 0; i < 20; i++) {
                    trayecto = trayecto + fR1.readChar();
                }

                //Leemos letra por letra la hora del trayecto y lo ponemos en su variable mencionada arriba
                for (int i = 0; i < 5; i++) {
                    hora = hora + fR1.readChar();
                }

                //Guardamos el numero de viajes limites que hay.
                capMax = fR1.readShort();

                //Creamos la variable capRest y la igualamos al maximo para luego restarlo
                capRest = capMax;

                //Try catch del archivo numero 2 que seran los vuelos comprados
                try {

                    //Nos situamos al principio del reservas.dat (el de las reservas realizadas)
                    fR2.seek(0);
                    //Bucle infinito de lectura del archivo de reservas.dat
                    do {
                        //Creamos la variable de la ID de la reserva
                        String id2 = "";
                        //Se va concatenando la reserva letra por letra en una string
                        for (int i = 0; i < 5; i++) {
                            id2 = id2 + fR2.readChar();
                        }
                        //Guardamos en la variable del numero de reservas con el readShort
                        cap = fR2.readShort();
                        //Hacemos la comprobación de que si la ID leida es igual a la ID que tenemos en el reservas.dat
                        if (id.equals(id2)) {
                            //Restamos las reservas máximas del viaje a las reservas realizadas
                            capRest = (short) (capMax - cap);
                            //Ponemos el valor booleano a false para que salga del bucle si lo es
                            flag = false;
                        }//Este if si no sucede entonces no puede salirse del dowhile, por lo que pasaria a la siguiente linea (viaje) y quizas entre o no.
                    } while (flag); //Si sale, entonces pasaría al siguiente viaje y volvería a comprobar el viaje entrando a este dowhile
                } catch (EOFException e) {
                    System.out.println("");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                } //Aqui pillamos las excepciones, 1 para que si es el final de archivo escriba un espacio en blanco, en caso de cualquier otro error el mensaje que le corresponda
                //Aqui imprimimos los datos con los datos ya restados
                System.out.println(id + " " + capRest);
            } while (true);
        } catch (EOFException e) {
            System.out.println("Final de fichero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        fR2.close();
        fR1.close();
    }
}