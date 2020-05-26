package condição3;

import java.util.Scanner;

public class dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner num = new Scanner(System.in);
		
		
		int n;
		
		System.out.println("Digite sua idade: ");
		n=num.nextInt();
		
		if (n>=5 && n<=10) {
		
			System.out.println("infantil");
		
		}
		if (n>=11 && n<=17) {
			
			System.out.println("juvenil");
			
			}
		if(n>=18) {
			System.out.println("adulto");
		
		}
	
	}

}
