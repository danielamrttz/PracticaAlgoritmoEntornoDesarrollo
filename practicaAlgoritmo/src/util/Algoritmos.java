package util;

public abstract class Algoritmos {
	/**
	 * Devuelve el fibonacci del numero especificado
	 * @param numero			el numero del que queremos calcular el fibonnaci
	 * @return					el fibonacci del numero especificado
	 */
	
	
	public static int fibonacci(int numero) {
		int  num1= 0, num2=1, aux, numFinal=0;
		
		if(numero<=1) {
		 return numero;
		 
		}else {
			for(int i=2; i<=numero; i++) {
		
				aux=num2;
				num2+=num1;
				num1=aux;
				
				numFinal=num2;
				
				
			}
		}
		
		return numFinal;
	}
	
	/**
	 * Devuelve el factorial del numero especificado
	 * @param numero			el numero del que queremos calcular el factorial
	 * @return					el factorial del numero especificado
	 */
	
	public static int factorial (int numero) {
		int resu=1;
		
		for(int i=1; i<=numero; i++) {
			resu*=i;
			
		}
		return resu;
	}

}
