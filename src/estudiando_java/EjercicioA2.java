package estudiando_java;
import java.util.Scanner;
public class EjercicioA2 {
	
	//metodo main ejecutable 
	public static void main(String[] args) 
	{ 
		
		Scanner scanner = new Scanner(System.in);
				 // leo el valor de n
				 
				int n = scanner.nextInt(); 
				int i = 1; 
				 while( i <= n ) {
				 // muestro el valor de i
				 System.out.println(i);
				 // incremento el valor de i
				 i++; 
				 }
				 
				 scanner.close();
		 }
	
	}
	
	

