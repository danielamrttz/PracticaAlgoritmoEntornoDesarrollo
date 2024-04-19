package Tests;
import util.Algoritmos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class testAlgoritmo {
	
	@Test
	void testFibonacci(){
		double numEsperado = 1;
		double numObtenido= Algoritmos.fibonacci(2);
		assertEquals(numEsperado, numObtenido);
		
	}
	
	@Test
	void testFactorial(){
		double numEsperado = 24;
		double numObtenido= Algoritmos.factorial(4);
		assertEquals(numEsperado, numObtenido);
		
	}
	
	@Test
	void testEsPrimo(){
		boolean valorEsperado = false;
		boolean valorObtenido= Algoritmos.esPrimo(4);
		assertEquals(valorEsperado, valorObtenido);
		
	}

}
