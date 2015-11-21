package Deberes;
import java.math.*;
public class solucionColision {
	
	public static int pruebaLineal(int direccion, int tamano)
	{
		if(direccion==tamano-1)
		{
			direccion=0;
			return direccion;
		}
		else
		{
			return (direccion+1);
		}
	}
	
	public static int pruebaCuadratica(int direccion, int tamano, int i, int cont2)
	{
		return (int) (direccion+Math.pow(i, 2));

	}
	
	public static int dobleDireccion()
	{
		
		return 0;
	}
	
	public static int arreglosAnidados()
	{
		return 0;
	}

}
