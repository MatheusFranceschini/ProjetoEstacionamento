import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vari�veis
		Scanner entrada = new Scanner(System.in);
		double renda=0, deposito=0, total=0, juros=0;
		
		//Entradas
		System.out.println("Digite o valor depositado:");
		deposito=entrada.nextDouble();
		System.out.println("Digite o juros:");
		juros=entrada.nextDouble();
		
		//Processamento
		renda=(deposito*juros)/100;
		total=renda+deposito;
		
		//Sa�das
		System.out.println("Valor com rendimento:"+renda);
		System.out.println("Valor final:"+total);
		
		
		
			

	}

}
