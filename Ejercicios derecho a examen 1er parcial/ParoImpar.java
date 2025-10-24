import java.util.Scanner;
public class ParoImpar {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int numeroN;

		System.out.println("--- Detector de Número Par o Impar) ---");
		System.out.print("Ingrese un número entero: ");    
		numeroN = sc.nextInt();
		
		if (numeroN % 2 == 0) 
		{
			System.out.println("Resultado: El número " + numeroN + " es PAR.");
		} 
		else 
		{
			System.out.println("Resultado: El número " + numeroN + " es IMPAR).");
		}           
		sc.close();
	}
}