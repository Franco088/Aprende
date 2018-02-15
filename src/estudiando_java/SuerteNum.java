package estudiando_java;
import java.util.Scanner;
public class SuerteNum {

	public static void main(String[] args) {
		int resultado, acum = 0, n = 0;
		Scanner ingrese = new Scanner(System.in);
		System.out.println( "Ingrese el dia:" );
		int dia = ingrese.nextInt();
		System.out.println( "Ingrese el mes:" );
		int mes = ingrese.nextInt();
		System.out.println( "Ingrese el anio:" );
		int anio = ingrese.nextInt();

		resultado = dia + mes + anio;
		while( resultado != 0 ){
		n = resultado%10;
		acum = acum + n;
		resultado = resultado / 10;
		}
		System.out.println( "El numero de la suerte es:" +acum );
		Scanner.close();
		}

	
	}


