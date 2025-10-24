import java.util.Scanner;
public class OrgnTrabajo {
	public static void main (String args[]) {
		int categoria, horas, pagohora = 0;
		double pagot1, pagot2, pagot3;
		String mensaje;
		Scanner sc = new Scanner (System.in);

		System.out.print("Ingresa Las horas trabajadas en el mes: ");
		horas = sc.nextInt();
		System.out.println("Ingresa a que categoría perteneces ya sea 1, 2, 3 o 4: ");
		System.out.println("1. Categoría 1");
		System.out.println("2. Categoría 2");
		System.out.println("3. Categoría 3");
		System.out.println("4. Categoría 4");
		categoria = sc.nextInt();

		switch (categoria) {
			case 1:	
				pagohora = 20000;
				break;
			case 2:
				pagohora = 15000;
				break;
			case 3:
				pagohora = 10000;
				break;
			case 4:
				pagohora = 7500;
				break;
			default:
				System.out.println("#Error#");
				System.out.println("Ingresa un valor válido");
				break;
		}

		pagot1 = pagohora * horas;
		
		if (pagot1 >= 1000000)
		{
			pagot2 = (pagot1 * 7.2) / 100;
			pagot3 = pagot1 - pagot2;
			mensaje = "una reducción por salud del 7.2%";
		}
		else 
		{
			pagot2 = (pagot1 * 15) / 100;
			pagot3 = pagot1 + pagot2;
			mensaje = "aumento por subsidio del 15% sobre tu salario";	
		}

		System.out.println("===== Consola de movimientos =====");
		System.out.println("Total de hrs trabajadas en el mes: " + horas + "hrs");
		System.out.println("Categoría a la que pertenece: " + categoria);
		System.out.println("Total pagado: $" + pagot1);
		System.out.println("Se te hizo un " + mensaje);
		System.out.println("El monto total a pagar es de: $" + pagot3);
	}
}