import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Coletar o nome do produto
//		System.out.print("Digite o nome do produto: ");
//		Scanner s = new Scanner(System.in);
		
//		String nomeProduto = s.next().toLowerCase();
//		System.out.println(nomeProduto);
//		switch(nomeProduto){
//		case "banana":
//			System.out.println("R$9,50");
//			break;
//		case "manga":
//			System.out.println("R$12,90");
//			break;
//		case "jabuticaba":
//			System.out.println("R$6,30");		
//		}
//		int a =1;
//		for (int i = 0 ; i < 10; i++) {
//			System.out.println(a++);
//		}		
 
		// 'for' para Arrays com o proprio tamanho em loop
		
		
//		String[] cars = {"BMW", "FIAT", "TESLA","TORO", "chevetti"};
		
//		for (int i = 0; i < cars.length; i++) {
//			System.out.print(cars[i]+ " ");
			
//		}
			// matrizes em loop
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.println(i + " " + j);
//			}		
//		}
		// While loop
		
//		int i = 0;
//		while (i <= 5) {
//			System.out.println(i + " - Hi");
//			i++;
//		}
		//chegue a um resultado de 0 a 100 somente mostrando os pares
		
//		for (int valor = 0; valor <= 100; valor++ ) {
//			if(valor % 2 == 0) {
//				System.out.print(valor + " ");
				
//			}
		//chegue a um resultado de 0 a 100 somente mostrando os inpares
		
//		for (int valor = 0; valor <= 100; valor++ ) {
//			if(valor % 2 != 0) {
//				System.out.print(valor + " ");
				
//			}		
//		}
		
		//desafio B 
		//receba uma palavra/frase do usuário e separe as letras que forem recebidas
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String entrada = scanner.nextLine();
		
		for (int i = 0;i <entrada.length();i++) {
			char letra = entrada.charAt(i);
			System.out.print(letra + " ");
		}	
		scanner.close();
		
	}
	
}
