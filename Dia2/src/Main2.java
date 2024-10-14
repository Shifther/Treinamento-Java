import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
//		int[] valor = {10,30,50,120,650,985,14,62}; 
		
//		Arrays.sort(valor);
//		System.out.println("Digite o 1º valor: " + Arrays.toString(valor));	
//		System.out.println(valor.length);
		
//		String[] cars = {"BMW", "TESLA", "FIAT", "AUDI"};		
//		cars[2]= "Ferrari";
//		System.out.println(Arrays.toString(cars));
//		System.out.println(cars[2]);
		
		//-- *** String com 2 box ***-
		
//		String[][] rodas = { {"roda frontal direita", "Roda frontal esquerda"} , {"Roda traseira direita", "roda traseira esquerda"}};
		
//		System.out.println(Arrays.deepToString(rodas));

		
		// ***- double fixo ***-
//	final double taxaJuros = 11.92;
	
//	System.out.println(taxaJuros);
	
//	double taxaaddJuros = taxaJuros + 1.8;
	
//	System.out.println(taxaaddJuros);
	
		
//		-****** String para int *****=
		
//	String valorProduto = "25";
//	int valorTotal = Integer.parseInt(valorProduto) + 120;
//	System.out.println(valorTotal);
	
		
		
		// arredondamentos aproximados ***
//		double valuepbaixo = Math.floor(10.5);
//		double valuepCima = Math.ceil(10.5);
//		double valuepAprox = Math.round(10.5);
//		double valueRandom = Math.random(); //numero random entre 0 a 1
		
//		int valueAleRedom = (int)Math.round(Math.random() * 100);
		
//		System.out.println(valuepAprox);		
//		System.out.println(valuepCima);		
//		System.out.println(valuepbaixo);
//		System.out.println(valueRandom);
//		System.out.println(valueAleRedom);
		
		
		
		// ***- Desafio ***-
		
		int [] my_array1= {
				1789, 2035, 1899, 1456, 2013,
				1458, 2458, 1254, 1472, 2365,
				1456, 2165, 1457, 2456};
		String[] my_array2= {
				"Java",
				"Python",
				"PHP",
				"C#", 
				"C Programming",
				"C++"
		};
		// ser feito: Array original =
	    // Array em ordem = (alfabética)
		
		System.out.println("Array [1] original = " + Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Array [1] ordenada = "+ Arrays.toString(my_array1));
		System.out.println("\nArray [2] original = " + Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println("Array [2] ordenada = "+ Arrays.toString(my_array2));		
		
		
	}
}