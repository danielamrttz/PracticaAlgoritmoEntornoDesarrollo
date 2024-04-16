package app;

import java.util.Random;

import util.Algoritmos;


public class Principal {

	public static void main(String[] args) {
		
		
		//Genero mi array, y le guardo 5 espacios en memoria
		int[] numeros = new int[5];
		
		
        Random random = new Random();
        //Genero un bucle para rellenar mi array con números random
        for (int i = 0; i < 5; i++) {
            numeros[i] = random.nextInt(10) + 1; 

        }
        
       //Array con los resultados del metodo fibonacci 
        
        int[] resultadoFibonacci = new int[5];
        for (int i = 0; i < 5; i++) {
            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
		
	}
        
       //Array con los resultados del metodo factorial
        
        int[] resultadoFactorial = new int[5];
        for (int i = 0; i < 5; i++) {
            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
		
	}
        
        
        //Array con los resultados del metodo esPrimo
        
        boolean[] resultadoEsPrimo = new boolean[5];
        for (int i = 0; i < 5; i++) {
            resultadoEsPrimo[i] = Algoritmos.esPrimo(numeros[i]);
      
        
        } 
		 
        }
}
