package sumando;
import java.util.Scanner;
public class Sumando {
	

	    public static void main(String[] args) {
	        
	        Scanner teclado = new Scanner(System.in);

	        System.out.print("Introduce el primer número: ");
	        int numero1 = (int) teclado.nextDouble();

	       
	        System.out.print("Introduce el segundo número: ");
	        int numero2 = (int) teclado.nextDouble();

	       
	       int resultado = numero1 + numero2;

	       
	        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);

	       
	        teclado.close();
	    }
	
}
