import java.util.ArrayList;

// https://trifulcas.com/ejercicios-colecciones/
public class Cliente {
    private String nombre;
    private String mail;
    private ArrayList telefonos;

    Cliente() {
        this.nombre=nombre;
        this.mail=mail;
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

    public void setTelefonos(ArrayList telefonos) {
        this.telefonos = telefonos;
    }

    public void addTelefonos (ArrayList<String> telefonos, String nuevoTelefono) {
        for (String x: telefonos) {
            if (x.equals(nuevoTelefono)) {
                System.out.println("Número existente");
            } else {
                telefonos.add(nuevoTelefono);
                System.out.println("Teléfono añadido");
            }
        }
    }

    public String getTelefonos (ArrayList<String> telefonos, Integer indice) {
        if (indice>=telefonos.size() || indice<0) {
            return "";
        } else {
            return telefonos.get(indice);
        }
    }

    public void buscarTelefono (ArrayList<String> telefonos, Integer telfFind) {

    }




}
