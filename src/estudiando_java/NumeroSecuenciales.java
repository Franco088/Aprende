package estudiando_java;
import java.util.*; 
public class NumeroSecuenciales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        int dia, mes, a�o, suerte, suma, cifra1, cifra2, cifra3, cifra4;
	        System.out.println("Introduzca fecha de nacimiento");
	        System.out.print("d�a: ");
	        dia = sc.nextInt();
	        System.out.print("mes: ");
	        mes = sc.nextInt();
	        System.out.print("a�o: ");
	        a�o = sc.nextInt();
	        suma = dia + mes + a�o;
	        cifra1 = suma/1000;      //obtiene la primera cifra
	        cifra2 = suma/100%10;  //obtiene la segunda cifra
	        cifra3 = suma/10%10;   //obtiene la tercera cifra
	        cifra4 = suma%10;        //obtiene la �ltima cifra
	        suerte = cifra1 + cifra2 + cifra3 + cifra4;
	        System.out.println("Su n�mero de la suerte es: " + suerte);
	        sc.close();
	}

}
