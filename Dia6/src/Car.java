
public class Car {
	
	private String marca;
	private String modelo;
	private int ano;
	private double juros = 0.1; //10%
	private double venda;
	
	

	
	Car(String marca, String modelo, int ano,int venda){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.venda = venda;
	}
		
	public double valorVenda() {
		double valorFinal = (venda * juros)+ venda;
		return valorFinal;
	}
	

	
	public String getMarca() {
		return marca;		
	}
	public String getModelo() {
		return modelo;		
	}
	public int getAno() {
		return ano;		
	}
	public double getVenda() {
		return venda;		
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;		
	}
	public void setMarca(String marca) {
		this.marca = marca;		
	}
	public void setAno(int ano) {
		this.ano = ano;		
	}
	
	
	
	
}
