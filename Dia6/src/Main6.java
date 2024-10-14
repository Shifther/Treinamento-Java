
public class Main6 {
 
	public static void main(String[] args) {
		
//		Clients c001 = new Clients();
		
//		c001.firstName = "Andre";
//		c001.age = 24;
		
//		Clients c002 = new Clients();
		
//		c002.firstName = "David";
//		c002.age = 24;
		

		
//		c002.newAccount(); 
		//Desafio Dia 6
		//adicionar valor de venda do carro
		//valor + 10% (double)
		Car car = new Car("BMW", "X6", 2024,130000);
		
		
		System.out.println(car.getMarca());
		System.out.println(car.getModelo());
		System.out.println(car.getAno());
		System.out.println("Valor final da venda: $ " + car.valorVenda());
		
		//
		
		
	}

}
