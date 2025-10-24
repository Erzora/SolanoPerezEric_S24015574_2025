import java.util.Scanner;
public class Promocion.java {
	public static void main(String args[]) {
		double totalCompra, montoDescuento,totalPagar ;
		String mensajeRegla;
		int numeroAzar;
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese el total de la compra: $");
		totalCompra = sc.nextDouble();

		System.out.println("Escoge un número al azar del 1 al 100");
		numeroAzar = sc.nextInt();

		System.out.println("\n--- Proceso de Promoción ---");
		System.out.println("Número escogido al azar: " + numeroAzar);

		if (numeroAzar < 74)
		{
			System.out.println("El número " + numeroAzar + " es MENOR que 74.");
			System.out.println("Ganaste el 15% de descuento");
			montoDescuento = totalCompra * .15;
		}
		else
		{
			System.out.println("El número " + numeroAzar + " es MAYOR o IGUAL a 74.");
			System.out.println("Ganaste el 20% de descuento");
			montoDescuento = totalCompra * .20;
		}

		totalPagar = totalCompra - montoDescuento;       
		System.out.println("\n===== Resultados ====");
		System.out.printf("Total de la Compra: $%.2f%n", totalCompra);
		System.out.printf("Monto Descontado: $%.2f%n", montoDescuento);
		System.out.printf("Total a Pagar: $%.2f%n", totalPagar);
    }
}