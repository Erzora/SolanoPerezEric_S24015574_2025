import java.util.Scanner;
public class Costollamadas{
	public static void main(String args[]) {
		int minutos;
		double total;
		Scanner sc = new Scanner(System.in);
        
		System.out.println("===== Costo de una llamada telefonica =====");
		System.out.print("Ingresar la duración de la llamada en minutos: ");
		minutos = sc.nextInt();        
		if (minutos <= 3)
		{
			total = 10.0; 
		}
		else
		{
			total = 10.0 + (minutos - 3) * 1.0;
		}
		System.out.println("Los minutos usados en llamada son: " + minutos);
		System.out.println("El costo total de la llamada es: $" + total);
		sc.close();
    }
}