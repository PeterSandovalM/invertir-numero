package invertir;

import java.io.*;

public class invertirNumero {

	public static void main(String[] args) throws IOException {
		int numero, invertido = 0, resto;
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Ingresa el numero que deseas invertir: ");
		numero = Integer.parseInt(leer.readLine());
		while(numero > 0) {
			resto = numero % 10;
			invertido = invertido * 10 + resto;
			numero = numero / 10;
		}
		System.out.println("El numero invertido es: "+ invertido);

	}

}
