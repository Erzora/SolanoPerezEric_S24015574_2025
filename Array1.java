import java.util.Scanner;
public class Array1{
	public static void main(String args[]){
		String mes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		int dias[] = new int[12];
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<12; i++)
		{
			System.out.print("El mes " + mes[i] + " tiene: ");
			dias[i] = sc.nextInt();
		}
	}
}