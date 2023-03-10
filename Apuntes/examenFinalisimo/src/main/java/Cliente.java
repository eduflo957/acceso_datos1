import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// https://trifulcas.com/ejercicios-colecciones/
public class Cliente {
    private String nombre;
    private String mail;
    private ArrayList telefonos;
    private HashMap compras;

    Cliente() {
        this.nombre = nombre;
        this.mail = mail;
        this.telefonos = telefonos;
        this.compras = compras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = new ArrayList<>();
        for (String telefono : telefonos) {
            this.telefonos.add(telefono);
        }
    }


    public void addTelefonos(Cliente cliente, String nuevoTelefono) {
        if (cliente.telefonos.contains(nuevoTelefono)) {
            System.out.println("Ya existe");
        } else {
            cliente.telefonos.add(nuevoTelefono);
            System.out.printf("Telefono %s añadido", nuevoTelefono);
        }
    }

    public String getTelefonos(Cliente cliente, Integer indice) {
        if (indice >= telefonos.size() || indice < 0) {
            return "";
        } else {
            return cliente.telefonos.get(indice).toString();
        }
    }

    public void buscarTelefono(Cliente cliente, String telfFind) {
            if (cliente.telefonos.contains(telfFind)) {
                System.out.println(cliente.telefonos);
            } else {
                System.out.println("no existe");
            }
        }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                ", telefonos=" + telefonos +
                '}';
    }
}
