import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		
		// desafio 1 = Criar 3 int onde o usuário
		//digite 3 valores aleatórios e repete logo após
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Digite o 1º valor: ");	
//		int valor1 = scanner.nextInt();
//		System.out.println("Digite o 2º valor: ");	
//		int valor2 = scanner.nextInt();
//		System.out.println("Digite o 3º valor: ");	
//		int valor3 = scanner.nextInt();
		
//		System.out.println("Valor digitado: " + valor1);
//		System.out.println("Valor digitado: " + valor2);
//		System.out.println("Valor digitado: " + valor3);
		
		//Desafio 2
		/*Criar um programa que teste as seguintes variações
		input  = N
		N é igual ao numero impar = Impar
		N é par e está entre 2 e 5 = A
		N é par e está entre 6 e 20 = B
		N é par e está acima de 20 = C
		*/
/*		System.out.println("Digite o valor: ");	
		int N = scanner.nextInt();
		
		for (int valor = N; valor <= N; valor++ ) {
			if(valor % 2 != 0) 
				System.out.println("Impar");	
			else 
				if(N >= 2 && N <=5)
					System.out.println("A");
				if(N >6 && N <= 20)
					System.out.println("B");
				else
					System.out.println("C");			
		}
*/		
			// Desafio 3
		//Criar uma calculadora onde recebe os os 2 valores e os operadores e entrege para o usuário o valor em double
		System.out.println("Digite a operação : ");	
		double Num1 = scanner.nextDouble();
		char op = scanner.next().charAt(0);
		double Num2 = scanner.nextDouble();
		
		if(op == '+') {
			System.out.println((int)Num1 + Num2);			
		}else if(op == '-') {
			System.out.println((int)Num1 - Num2);
		}else if(op == '/') {
			System.out.println((int)Num1 / Num2);
		}else if(op == '*') {
			System.out.println((int)Num1 * Num2);
		}else {
			System.out.println("Conta errada");
		}		
		
		
		
		scanner.close();
	}	
	
}
