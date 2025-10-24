import java.util.Scanner;
public class Comisiones {
	public static void main (String args[]) {
		String mensaje = "";
		int numv1, numv2, numv3, numv4, ventast = 0;
		double comision = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("========== Calculadora de Comisiones ==========");
		System.out.print("Ingresa el valor de la primera venta: ");
		numv1 = sc.nextInt();
		System.out.print("Ingresa el valor de la segunda venta: ");
		numv2 = sc.nextInt();
		System.out.print("Ingresa el valor de la tercera venta: ");
		numv3 = sc.nextInt();
		System.out.print("Ingresa el valor de la cuarta venta: ");
		numv4 = sc.nextInt();

		ventast = numv1 + numv2+ numv3 + numv4;
		
		if (ventast <= 1000000)
		{
			comision = (ventast * 2) / 100;
			mensaje = "una comisión del 2%";
		}
		else {
			if (ventast > 1000000 && ventast <= 15000000)
			{
				comision = (ventast * 4) / 100;
				mensaje = "una comisión del 4%";
			}
			else
			{
				if (ventast > 15000000)
				{
					comision = (ventast * 10) / 100;
					mensaje = "una comisión del 10%";
				}
			}
		}
		System.out.println("El valor total de las ventas fue de: $" + ventast);
		System.out.println("Se le hizo " + mensaje);
		System.out.println("El total de las comisiones ganadas por el trabajador es de: $" + comision);
		
	}
}