import java.util.Scanner;
class pulsasiones {
	public static void main(String args[]){
		int edad;
		double pulso;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu edad");
		edad = sc.nextInt();
	
		pulso = (220-edad)/10;
		System.out.println("Tu número de pulsaciones debe ser: " + pulso);
	}
}