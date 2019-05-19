package ar.edu.unlam.pb2.cuenta;

public class CajaDeAhorro extends Cuenta {
	
	private final Integer EXTRACCIONES = 5;
	private final Double COMISION = 6.0;
	private Integer intentos = 0;
	
	public CajaDeAhorro(String titular, Double cantidad) {
		super(titular, cantidad);

	}
	
	@Override
	public void depositar(Double deposito) {

		if (deposito > 0) {
			this.cantidad += deposito;
		}
	}
	
	@Override
	public void extraer(Double cantidad) {
		
		if (cantidad > 0 && cantidad <= this.cantidad) {
			
			if(intentos < EXTRACCIONES) {
				
				this.cantidad -= cantidad;
				
				intentos++;
			}
		}else {
			
			Double multa;

			multa = cantidad + COMISION;
			
			if (cantidad > 0 && multa <= this.cantidad) {
				
				this.cantidad = this.cantidad - multa;
				
			}
		}
	}
}
