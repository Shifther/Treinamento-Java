import java.lang.foreign.SymbolLookup;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Formatação de moedas
//		NumberFormat pound = NumberFormat.getCurrencyInstance();
		
//		String productValue= pound.format(1120.80);
		
//		System.out.println(productValue);
	
		// == (igual?)
		// != (diferente)
		// > ( maior)
		// < (menor)
		// >= (maior ou igual)
		// <= (menor ou igual)
//		int a = 4;
//		int b = 5;
		
//		System.out.println(a != b);
		
		// AND ( && )
		
//		int pricePorduct = 20;
//		boolean buy = pricePorduct >= 10 && pricePorduct <= 15;
		
//		System.out.println(buy);
		
		// OR ( || )
//		boolean temEmprego = true;
//		boolean temEmpresa = true;
//		boolean tem50k = true;
		
		
//		boolean podeFinanciar = (temEmprego || temEmpresa) && tem50k;
//		System.out.println(podeFinanciar);
		
		// if e else
		
//		int valorCarro = 80_000;
		
//		if (valorCarro >= 100_000) {
//			System.out.println("Não comprar acima da tabela");
//		} else if (valorCarro >= 120_00 && valorCarro <= 150_000) {
//			System.out.println("Comprar carro");
//		} else {
//			System.out.println("Não comprar. Valor abaixo da tabela");
//		}
	
		// Operador ternário	
			
//			int ingresso = 400;
//			String terAcesso = ingresso >= 500 ? "VIP" : "Pista";
			
//			if (ingresso >= 500) 
//				terAcesso = "VIP";
			
//				System.out.println(terAcesso);
					
	// Projeto
		
		// Criar um código onde receba o valor que o usuário está digitando e conte a quantidade de digitos o numero tem até 5 casas, caso passe diga que tenha mais
        Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor: ");	
		int numeroInt = scanner.nextInt();
		
		if (numeroInt >= 0 && numeroInt < 10) {
			System.out.println("Valor tem 1 digito");
		}else if(numeroInt >=10 && numeroInt <100) {
			System.out.println("Valor tem 2 digitos");
		}else if(numeroInt >=100 && numeroInt <1000) {
			System.out.println("Valor tem 3 digitos");
		}else if(numeroInt>=1000 && numeroInt <10000) {
			System.out.println("Valor tem 4 digitos");
		}else{
			System.out.println("Valor tem 5 digitos ou mais");
		}
		
		scanner.close();
	}

}
