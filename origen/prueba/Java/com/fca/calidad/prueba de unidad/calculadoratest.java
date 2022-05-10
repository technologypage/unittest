package com.fca.calidad.unittest;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class calculadoratest {
	public calculadora micalculadora;

	@Before
	public void setUp() throws Exception {
		micalculadora = new calculadora();
	}

	

	@Test
	public void sumatest() {
		double resultadoejecucion = micalculadora.suma(1, 3);
		double resultadoesperado  10;		
		assertThat(resultadoejecucion, is(resultadoesperado));
		
	}
	

}

