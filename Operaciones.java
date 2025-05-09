import java.util.Scanner;
public class Operaciones {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu primer numero entero : ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingresa tu segundo numero entero : ");
        int numero2 = scanner.nextInt();

        System.out.println("Ingresa tu tercer numero entero : ");
        int numero3 = scanner.nextInt();

        System.out.println("Ingresa tu cuarti numero entero : ");
        int numero4 = scanner.nextInt();
        
        int resultado = numero1+numero2+numero3+numero4;

        System.out.println(" ");
        System.out.println("El resultado de tu suma es : " + resultado);
    }
}