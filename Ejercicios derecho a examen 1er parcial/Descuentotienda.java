import java.util.Scanner;

public class Descuentotienda {
	public static void main(String args[]) {
		double descuento, totalFinal, totalCompra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el total de la compra:");
		
		totalCompra = sc.nextDouble();
		descuento = totalCompra * 0.15;
		totalFinal = totalCompra - descuento;

		System.out.printf("Descuento aplicado: $%.2f\n", descuento);
		System.out.printf("Total a pagar con el 15%% de descuento: $%.2f\n", totalFinal);
		sc.close();
    }
}