import java.util.Scanner;

public class Hospital {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double presupuesto, ginecologia, traumatologia, pediatria;
		
		System.out.print("Ingrese el presupuesto anual del hospital: ");
		presupuesto = sc.nextDouble();
		
		ginecologia = presupuesto * 0.40;
		traumatologia = presupuesto * 0.30;
		pediatria = presupuesto * 0.30;

		System.out.println("\n--- Distribución del presupuesto ---");
		System.out.printf("Ginecología:     $%.2f%n", ginecologia);
		System.out.printf("Traumatología:   $%.2f%n", traumatologia);
		System.out.printf("Pediatría:       $%.2f%n", pediatria);

		sc.close();
    }
}