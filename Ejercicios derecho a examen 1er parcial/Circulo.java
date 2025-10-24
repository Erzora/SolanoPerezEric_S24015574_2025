import java.util.Scanner;
class Circulo {
	public static void main (String args[]) {
		double radio, longitud, area;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el radio del círculo");
		radio = sc.nextInt();

		longitud = 2*3.1416*radio;
		area = 3.1416 * (radio * radio);

		System.out.println("La longitud del círculo es: " + longitud);
		System.out.println("El área del círculo es: " + area + "cm²");
}
}