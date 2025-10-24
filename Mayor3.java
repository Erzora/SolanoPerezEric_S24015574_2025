import java.util.Scanner;
public class Mayor3 {
	public static void main(String args[]){
		double num1, num2, num3;
 		double mayor, menor, promedio;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("===== Analiza 3 Valores =====");
		System.out.print("Ingrese el primer valor: ");
		num1 = sc.nextDouble();
        	System.out.print("Ingrese el segundo valor: ");
		num2 = sc.nextDouble();
        	System.out.print("Ingrese el tercer valor: ");
		num3 = sc.nextDouble();
        	
		if (num1 == num2 && num2 == num3) 
		{
            		System.out.println("Respuesta:");
            		System.out.println("Los tres valores ingresados son iguales");
        	}
		else 
		{
			mayor = num1;
			if (num2 > mayor) 
			{
                		mayor = num2;
			}

			if (num3 > mayor) 
			{
				mayor = num3;
			}
			menor = num1;
		
			if (num2 < menor) 
			{
				menor = num2;
			}
			if (num3 < menor) 
			{
				menor = num3;
			}
		promedio = (num1 + num2 + num3) / 3;
		System.out.println("=== RESULTADO ===");
		System.out.println("El número MAYOR es: " + mayor);
		System.out.println("El número menor es: " + menor);
		System.out.printf("El promedio de los tres valores es: %.2f\n", promedio);
		}
		sc.close();
	}
}