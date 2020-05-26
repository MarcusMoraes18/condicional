package condição3;
import java.util.Scanner;
public class quatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner lados=new Scanner(System.in);
	
	
	int n1, n2, n3 ;
	
	System.out.println("digite o primeiro valor");
	n1=lados.nextInt();
	
	System.out.println("digite o segundo valor");
	n2=lados.nextInt();
	
	System.out.println("digite o terceiro valor");
	n3=lados.nextInt();
	
	
	if (n1 == n2 && n1 == n3 && n2 == n3){
		
	System.out.println("Esse triangulo é equilátero");	
	}	
	
	else if (n1 != n2 && n1 != n3 && n2 != n3) {
	
	System.out.println("Esse triangulo é escaleno");	
	}
	
	else {
		
	System.out.println("Esse triangulo é isósceles");		
		
	}
	
	}

}
