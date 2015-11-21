package Deberes;

import java.util.Scanner;

public class UsoOrdenamiento {
	static int numeros[]=new int[50]; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamano=0,i,clave,posicion;
		Ordenamiento ordena=new Ordenamiento();
		Busqueda buscar=new Busqueda();
		tamano=ingresoTeclado("Ingrese el tamaño del vector");
		for(i=0;i<tamano;i++)
		{
			numeros[i]=ingresoTeclado("Ingrese un numero");
		}
		System.out.println("Vector original");
		ordena.imprimir(numeros,tamano);
		System.out.println("\nVector ordenado");
		ordena.burbuja(numeros, tamano);
		ordena.imprimir(numeros,tamano);
		clave=ingresoTeclado("\nIngresar elemento a buscar");
		posicion=buscar.busquedaBinaria(numeros, tamano, clave);
		if((buscar.busquedaBinaria(numeros, tamano, clave))>0)
		{
			System.out.println("Elemento encontrado en la posicion: "+buscar.busquedaBinaria(numeros, tamano, clave));
		}
		else
		{
			System.out.println("El elemento no se encuentra en el arreglo");
		}
		
		/*posicion=buscar.secuencial(numeros, tamano, clave);
		if((buscar.secuencial(numeros, tamano, clave))>0)
		{
			System.out.println("Elemento encontrado en la posicion: "+buscar.secuencial(numeros, tamano, clave));
		}
		else
		{
			System.out.println("El elemento no se encuentra en el arreglo");
		}*/
		//ordena.imprimir(numeros,tamano);
		//ordena.seleccion(numeros, tamano);
		//ordena.burbuja(numeros, tamano);
		//ordena.insercion(numeros, tamano);
		//System.out.println("\n\nVector Ordenado");
		//ordena.imprimir(numeros, tamano);
	}
	
	public static int ingresoTeclado(String mensaje)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(mensaje);
		return in.nextInt();
	}
}
