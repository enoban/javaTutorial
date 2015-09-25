package com.teaching.oop;

import java.util.Scanner;;



public class LogicalExamples {
	
	public static double suma(double n1, double n2){
		return n1 + n2;
	}
	
	public static double sustraccion(double n1, double n2){
		return n1 - n2;
	}
	
	public static double multiplicacion(double n1,double n2){
		return n1 * n2;
	}
	
	public static double division(double n1, double n2){
		return n1 / n2;
	}
	
	public static int pow(int base,int exponente) {
		int resultado = 1;
		for(int count = 1;count <= exponente; count++){
			resultado *= base;
		}
		return resultado;
	}
	
	public static double sumaConsecutivos(double n1) {
		double r;
						
		r = n1 * ((n1+1)/2.0);
		System.out.println("La suma de: ");
		for(int count = 1;count <= n1;count++){
			if(count==1)
				System.out.print(+ count);
			else
				System.out.print(" + " + count);
		}
		System.out.println(" es igual a: " + r);
		return r;
	}
	
	public static int factorial(int n1) {
		int r = 1;
		
		System.out.println("La multiplicacion de: ");
		for(int count = 1;count <= n1;count++){
			if(count==1)
				System.out.print(+ count);
			else
				System.out.print(" * " + count);
			r *= count;
		}
		System.out.println(" es igual a: " + r);
		return r;
	}
	
	public static boolean primo(double n1) {
		if(n1<=1)	return false;
		
		for(int count = 2;count < n1;count++){
			if(n1%count==0) return false;
		}
		return true;
		
		/*
		if(n1==2){
			System.out.println("Yuju el numero 2 es primo!!! (NOTA:el unico que es par)");
			return;
		}
		if(n1<=1){
			System.out.println("No es numero primo :(, suerte para la proxima");
			return;
		}
		rt = n1%2;
		if(rt==0)
			System.out.println("No es numero primo :(, suerte para la proxima");
		else{
			rt = n1%3;
			if(rt==0)
				System.out.println("No es numero primo :(, suerte para la proxima");
			else{
				rt = n1%5;
				if(rt==0)
					System.out.println("No es numero primo :(, suerte para la proxima");
				else{
					System.out.println("Yuju el numero " + (int)n1 + " es primo!!!");
				}
			}
		}
		*/
	}
	
	public static int[] fibonacci(int n1) {
		int[] result = new int[n1];
		
		if(n1==1){
			result[0] = 1;
			return result;
		}
		if(n1<=0){
			System.out.println("No se ingreso un numero valido");
			return result;
		}
		for(int count = 2;count < n1;count ++){
			result[0] = 1;
			result[1] = 1;
			result[count]=result[count-1]+result[count-2];
		}
		return result;
	}
	

	
	public static void main(String[] args) {
		int sw,base,exponente,factorial,fibo;
		double n1,n2;
		Scanner kb = new Scanner(System.in);
	 	
		System.out.print("Que opcion deseas?\n");
        System.out.print("\n");
        System.out.print("1. Suma de 2 numeros.\n");
        System.out.print("2. Resta de 2 numeros.\n");
        System.out.print("3. Multiplicacion de 2 numeros.\n");
        System.out.print("4. Division de 2 numeros.\n");
        System.out.print("5. Potencia de n a la z.\n");
        System.out.print("6. Sumatoria de 1 hasta n.\n");
        System.out.print("7. Factorial de n.\n");
        System.out.print("8. Numero Primo.\n");
        System.out.print("9. Serie de fibonacci.\n");
        System.out.print("0. Salir.\n\n");
        sw = kb.nextInt();
        
        switch(sw) {
        case 1:
        	System.out.println("Suma de 2 numeros \n");
        	System.out.print("Ingresa el primer numero ");
        	n1 = kb.nextDouble();
        	System.out.print("Ingresa el segundo numero ");
        	n2 = kb.nextDouble();
        	System.out.print("\nEl resultado es: ");
    		System.out.print(suma(n1, n2));
    		break;
        	
        case 2:
        	System.out.println("Resta de 2 numeros \n");
        	System.out.print("Ingresa el primer numero ");
        	n1 = kb.nextDouble();
        	System.out.print("Ingresa el segundo numero ");
        	n2 = kb.nextDouble();
        	System.out.print("\nEl resultado es: ");
    		System.out.print(sustraccion(n1, n2));
        	break;
        
        case 3:
        	System.out.println("Multiplicacion de 2 numeros \n");
        	System.out.print("Ingresa el primer numero ");
        	n1 = kb.nextDouble();
        	System.out.print("Ingresa el segundo numero ");
        	n2 = kb.nextDouble();
        	System.out.print("\nEl resultado es: ");
    		System.out.print(multiplicacion(n1, n2));
        	break;
        	
        case 4:
        	System.out.println("Division de 2 numeros \n");
        	System.out.print("Ingresa el primer numero ");
        	n1 = kb.nextDouble();
        	System.out.print("Ingresa el segundo numero ");
        	n2 = kb.nextDouble();
        	System.out.print("\nEl resultado es: ");
    		System.out.print(division(n1, n2));
        	break;
        	
        case 5:
        	System.out.println("Exponende de x a la n \n");
        	System.out.print("Ingresa el numero base ");
        	base = kb.nextInt();
        	System.out.print("Ingresa la potencia ");
        	exponente = kb.nextInt();
        	System.out.print("\nEl resultado es: ");
        	System.out.println(pow(base,exponente));
        	break;
        
        case 6:
        	System.out.println("Sumatoria de Consecutivos n\n");
        	System.out.print("Ingresa el numero hasta el cual se hara la suma ");
    		n1 = kb.nextInt();
        	sumaConsecutivos(n1);
        	break;
        	
        case 7:
        	System.out.println("Factorial de n\n");
        	System.out.print("Ingresa el numero hasta el cual se obtendra el factorial ");
    		factorial = kb.nextInt();
        	factorial(factorial);
        	break;
        	
        case 8:
        	System.out.println("Primo o no Primo (para numeros menores a 1000 :P )\n");
        	System.out.print("Ingresa el numero, te dire si es primo o no ");
    		n1 = kb.nextInt();
        	System.out.println(primo(n1));
        	break;
        	
        case 9:
        	System.out.println("Fibonacci series");
        	System.out.print("Ingresa un numero y te mostrare su serie de fibonacci ");
        	fibo = kb.nextInt();
        	int[] ftemp = fibonacci(fibo);
        	
    		System.out.println(ftemp[0]);
        	break;
        	
        case 0:
        	System.out.println("Hata Luego");
        	break;
        
        default:
        	System.out.println("Numero invalido");
        	break;
        }
        kb.close();
		
	}
}
