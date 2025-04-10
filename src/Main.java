import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el ancho del rectángulo: ");
        int ancho = sc.nextInt();

        System.out.print("Introduce el alto del rectángulo: ");
        int alto = sc.nextInt();

        Rectangulo rect = new Rectangulo(ancho, alto);

        System.out.println("\nRectángulo original:");
        rect.mostrar();

        // Cambiar dimensiones
        System.out.print("\nIntroduce el nuevo ancho: ");
        ancho = sc.nextInt();
        rect.setAncho(ancho);

        System.out.print("Introduce el nuevo alto: ");
        alto = sc.nextInt();
        rect.setAlto(alto);

        System.out.println("\nRectángulo modificado:");
        rect.mostrar();
    }
}
