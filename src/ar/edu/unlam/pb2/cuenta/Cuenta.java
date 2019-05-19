package ar.edu.unlam.pb2.cuenta;

public class Cuenta {

	protected String titular;
	protected Double cantidad;
	
	public Cuenta(String titular, Double cantidad) {
		
		this.titular = titular;
		this.cantidad = cantidad;
		
	}
	
	public String consultarTitular() {
		
		return this.titular;
		
	}
	
	
	public Double consultarSaldo() {
		
		return this.cantidad;
		
	}
	
	
	public void depositar(Double cantidad) {
		
	}
	
	public void extraer(Double cantidad) {
			
	}
	
	public String toString() {
		
		return this.titular + " " + this.cantidad;
	}
}
