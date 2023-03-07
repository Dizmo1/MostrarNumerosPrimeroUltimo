package MostrarNumerosPrimeroUltimo;

import java.util.Arrays;
import java.util.Scanner;

public class MostrarNumerosPrimeroUltimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int tabla[];
		tabla = new int[10];
		for ( int i=0;i<10;i++){
		System.out.print("Introduce un número: ");
		tabla[i]=entrada.nextInt();
		}	
		System.out.println("El resultado es:");
		System.out.println (Arrays.toString(tabla));
		entrada.close();
	
	}

}
