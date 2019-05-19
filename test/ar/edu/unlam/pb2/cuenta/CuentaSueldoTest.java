package ar.edu.unlam.pb2.cuenta;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CuentaSueldoTest {

	@Test
	public void pruebaDeposito() {
		
		CuentaSueldo cuenta = new CuentaSueldo("Ramiro",500.0);
		cuenta.depositar(4000.0);
		
		Double esperado = 4500.0;
		
		Assert.assertEquals(esperado,cuenta.consultarSaldo(),0.01);
	}

}
