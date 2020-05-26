package condição3;
import java.util.Scanner;
public class cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner num = new Scanner(System.in);
	Scanner mat = new Scanner(System.in);
	
	float n1, n2, n3, n4, nf;
	int Matricula;
	
	System.out.println("Digite a matrícula");
	Matricula = mat.nextInt();
	
	System.out.println("Digite a primeira nota:");
	n1 = num.nextFloat();
	
	System.out.println("Digite a segunda nota:");
	n2 = num.nextFloat();
	
	System.out.println("Digite a terceira nota:");
	n3 = num.nextFloat();
	
	System.out.println("Digite a quarta nota:");
	n4 = num.nextFloat();
	
	nf=(n1+n2+n3+n4)/4;
	
	
	if(nf >= 7 && nf <= 10) {
		
		System.out.println( Matricula +" Sua nota: " + nf + " Aprovado");
		
	}
	
	else if(nf >= 3.5 && nf < 7) {
		
		System.out.println( Matricula +" Sua nota: " + nf + " Recuperção");
		}
	
	else if(nf < 3.5) {
		
		System.out.println( Matricula +" Sua nota: " + nf + " Reprovado");
		}
	
	else {
		System.out.println("Alguma nota esta errada");
	}
	
	
	}

	
}
