import java.util.Scanner;
public class Cadena {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe tu nombre : ");
        String nombre = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Escribe tu apellido paterno : ");
        String apellido = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Escribe tu apellido materno : ");
        String apellido2 = scanner2.nextLine();

        System.out.print("Tu nombre es : " + nombre +" " + apellido + " " + apellido2);

    }

}