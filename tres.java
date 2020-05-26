package condição3;
import java.util.Scanner;
public class tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Leitor = new Scanner(System.in);
				
	int sal;
	
	System.out.println("coloque seu salario: ");
	sal=Leitor.nextInt();
	
	
	if(sal <= 1000) {
		
		System.out.println("Seu aumento foi de 15%: " + (sal*15/100+sal));
	}
	
	if (sal > 1000 && sal <= 2500) {
		
		System.out.println("Seu aumento foi de 7%: " + (sal*7/100+sal));
		
	}
		
	else {
		
		
		System.out.println("Você não teve aumento: " + sal);	
										
	}	
	}

}
