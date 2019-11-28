package es.studium.Inversa;

import java.util.Scanner;

public class Inversa {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		String cadena1;
		String inversa="";
		int x;

		System.out.println("Escribe la cadena: ");
		cadena1=teclado.nextLine();
		for ( x=cadena1.length()-1;x>=0;x--) {
			inversa += cadena1.charAt(x);	}	
	    System.out.println(inversa);
		teclado.close();
	}}
	