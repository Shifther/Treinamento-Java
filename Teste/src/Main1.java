import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		//Calculadorinha
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
		System.out.println("Digite o 1º valor: ");	
		int numeroInt = scanner.nextInt();
		
		System.out.println("Digite o 2º valor: ");	
		int numeroInt2 = scanner.nextInt();		
		
		int somaT = numeroInt + numeroInt2;
		
		// TODO Auto-generated method stub
		System.out.println("O valor total da soma eh: " + somaT );		
		
		scanner.close();
	}

}
