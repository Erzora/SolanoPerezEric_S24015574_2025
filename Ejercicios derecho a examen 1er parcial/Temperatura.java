import java.util.Scanner;
class Temperatura {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T;
		double far, tabs;
		
		System.out.println("Escribe la temperatura a convertir");
		T = sc.nextInt();

		far = (T * 1.8) +32;
		tabs = T + 273.15;

		System.out.println(T + "°C es en farenheit: " + far + "°F");
		System.out.println(T + "°C es en temperatura absoluta: " + tabs + "°K");
	}
}