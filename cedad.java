import java.util.Scanner;
class cedad {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int edad, fecha;
		
		System.out.println("Ingresa el año en el que naciste");
		fecha = sc.nextInt();
		
		edad = 2025 - fecha;
		System.out.println("Tu edad es de " + edad);
	}
}