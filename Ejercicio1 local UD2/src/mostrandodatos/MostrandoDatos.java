package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Nombre: ");
	        String nombre = sc.nextLine();
	        System.out.print("Apellido: ");
	        String apellido = sc.nextLine();
	        System.out.println("Hola, " + nombre + " " + apellido);
	        sc.close();

	}

}
