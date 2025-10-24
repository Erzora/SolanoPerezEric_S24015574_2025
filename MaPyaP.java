import java.util.Scanner;
class MaPyaP {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		double metro, pie, pulgada;

		System.out.println("=== Convertidor de metro a pie y a pulgada ===");
		System.out.println("1m ----> 3.281 pies");
		System.out.println("1m ----> 39.37 pulgadas");

		System.out.println("Ingresa la cantidad en metros que deseas Convertir");
		metro = sc.nextDouble();

		pulgada = metro * 39.37;
		pie = metro * 3.281;

		System.out.println(metro + "m son: " + pulgada + " pulgadas");
		System.out.println(metro + "m son: " + pie + " pies");
}
}