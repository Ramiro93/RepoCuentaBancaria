package ar.edu.unlam.pb2.cuenta;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo(String titular, Double cantidad) {
		super(titular, cantidad);

	}
	

	@Override
	public void depositar(Double deposito) {

		if (deposito > 0) {
			this.cantidad =+ deposito;
		}
	}
	
	@Override
	public void extraer(Double extraccion) {

		if (extraccion > 0 && extraccion <= this.cantidad) {

			this.cantidad =- extraccion;
		}
	}
}
