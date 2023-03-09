import java.util.Scanner;

public class ScannerEdu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número entero: ");
        int entero = Integer.parseInt(sc.nextLine());
        System.out.println("Número Float: ");
        float flotante = Float.parseFloat(sc.nextLine());
        System.out.println("Carácter: ");
        char letra = sc.nextLine().charAt(0);
        System.out.println("Palabra: ");
        String palabra = sc.nextLine();

        System.out.println("Resultado impreso: "+entero+" "+flotante+" "+letra+" "+palabra);
    }
}

