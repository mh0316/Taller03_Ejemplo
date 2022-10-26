import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        System.out.println("Clase de ejemplo");
        System.out.print("Ingrese un número: ");
        int numero = ingresar();
        mostrarResultado(numero);
    }

    private static void mostrarResultado(int numero){
        System.out.println("El resultado es: "+numero);
    }

    public static int ingresar() {
        Scanner teclado = new Scanner(System.in);
        int entrada;
        do {
            try {
                entrada = teclado.nextInt();
                break;
            } catch (Exception e) {
                //mostrarError();
                teclado.nextLine();
            }
        } while (true);
        return entrada;
    }
}