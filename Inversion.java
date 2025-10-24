import java.util.Scanner;
public class Inversion{
	public static void main(String[] args) {
		double capital, tasaMensual, ganancia, totalConGanancia;
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese el capital que desea invertir: $");
		capital = sc.nextDouble();
		tasaMensual = 0.02;
		ganancia = capital * tasaMensual;
        	totalConGanancia = capital + ganancia;

		System.out.printf("Ganancia después de un mes: $%.2f\n", ganancia);
		System.out.printf("Total después de un mes: $%.2f\n", totalConGanancia);
		sc.close();
    }
}