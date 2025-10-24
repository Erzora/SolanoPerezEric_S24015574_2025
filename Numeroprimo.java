import java.util.Scanner;
public class Numeroprimo {
	public static void main(String args[]){
		int N, numero, i, limite;
		boolean primo, esprimo;
		Scanner sc = new Scanner(System.in);  

		System.out.println("Ingrese un número entero: ");      
		N = sc.nextInt();
		System.out.println("El número ingresado es: " + N);
		boolean primo = esprimo(N);
		if (primo) 
		{
		System.out.println("Mensaje: El número " + N + " ES un número Primo.");
		}
		else 
		{
		System.out.println("Mensaje: El número " + N + " NO es un número Primo.");
		}
	}

	public static boolean esprimo(numero) {
        	if (numero <= 1) 
		{
            		return false;
        	}

        	if (numero == 2) 
		{
            		return true;
        	}

        	if (numero % 2 == 0)
		{
            		return false;
        	}
        	limite = (int) Math.sqrt(numero);
        	for (i = 3; i <= limite; i += 2) 
		{
            		if (numero % i == 0)
			{
                		return false;
            		}
        	}

        return true;
    }

}