package estudiando_java;

public class If_Else {

	public static void main(String[] args) {
		double[] a = { 10, 23.5, 15, 7, 8.9 };
        double total = 0;
        int i;
 
        for (i=0; i<5; i++)
            total += a[i];
 
        System.out.println( "La media es:" );
        System.out.println( total / 5 );
	}

}
