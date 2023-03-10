import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class repaso1 {
    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente();

        cliente.setMail("@edu");
        cliente.setNombre("edu");
        cliente.setTelefonos(new ArrayList<String>(Arrays.asList("666", "777")));

        System.out.println("Imprimir cliente: "+cliente);
        System.out.println("Método addTelefonos: ");

        cliente.addTelefonos(cliente,"655");

        System.out.println("\nImprimir con nuevos telfs: "+cliente);
        cliente.buscarTelefono(cliente,"666");

    }
}

