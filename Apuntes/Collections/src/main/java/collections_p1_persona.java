public class collections_p1_persona {
package colecciones_paquete1;

import java.util.Objects;

    public class colecciones_p1_practica1_persona {
        private String nombre = "";
        private int edad = 0;

        colecciones_p1_practica1_persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String toString() {
            return "colecciones_p1_practica1_persona [nombre=" + nombre + ", edad=" + edad + "]";
        }

        /*ESTO ES HACIENDO HASHCODE DESDE SOURCE
        @Override
        public int hashCode() {
            return Objects.hash(edad, nombre);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            colecciones_p1_practica1_persona other = (colecciones_p1_practica1_persona) obj;
            return edad == other.edad && Objects.equals(nombre, other.nombre);
        }
        */
        //El profe lo ha hecho así
        public boolean equals (Object obj) {
            colecciones_p1_practica1_persona p = (colecciones_p1_practica1_persona)obj; //hago el casting de obj para que pase a clase persona
            if (edad==p.edad && nombre.equals(p.nombre)) //Recuerda que en los strings no se puede "==", porque en string es "equals"
                return true;
            else
                return false;
        }

        public int hashCode1() {
            return nombre.hashCode()+edad*1000;
        }

        //En la clase Objects tenemos un método que se llama hash
        public int hashCode2() {
            return Objects.hash(nombre,edad);
        }



    }




}
