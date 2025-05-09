import java.util.Scanner;
public class Entero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu nombre : ");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa a la inicial de tu Nombre : ");
        char inicial = scanner.next().charAt(0);

        System.out.println("Ingresa tu estatura en Metros : ");
        double estatura = scanner.nextDouble();

        System.out.println("¿Eres estudiante? : (Ture/False)");
        boolean esEstudiante = scanner.nextBoolean();

        System.out.println("Ingresa tu edad : ");
        int edad = scanner.nextInt();
        
        System.out.print(" Tus datos son : " + nombre + " | " + inicial + " | " + estatura + " | " + esEstudiante + " | " + edad + " |");
        
    }
}