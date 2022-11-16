package unico;

import java.util.Scanner;

public class Ejercicio11 {
	

	public static void main(String[] args) {
		/*
		 Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
		 */
		
		Scanner leer = new Scanner (System.in);
	
	
		int mult;
		
		String mensaje;
		for (int tabla = 1; tabla <= 10; tabla++) {
			System.out.println("La tabla del " + tabla);
			System.out.println("----------------");
			for(int i=1; i<=10;i++) {
			mult = tabla*i;
			mensaje = tabla + " x " + i + " = " + mult;
			System.out.println(mensaje);
			}
			System.out.println();
		}
		
	
	}
}

