package textoInvertidoLPD6;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	private void invertirString(String palabra) {
		String [] arrayPalabra=palabra.split("");
//		String sPalabra=Arrays.toString(arrayPalabra);
//		System.out.println(sPalabra);
		StringBuilder text=new StringBuilder();
		for(int i=arrayPalabra.length - 1 ; i>=0 ;i--) {
			text.append(arrayPalabra[i]);
		}
		System.out.println(text);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		App app=new App();
		System.out.println("Ingrese una palabra");
		String palabra=sc.nextLine();
		app.invertirString(palabra);
	}

}
