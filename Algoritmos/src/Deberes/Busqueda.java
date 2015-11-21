package Deberes;

public class Busqueda {
	
	public int secuencial(int A[],int n, int x)
	{
		int i=1;
		while(i<n&&A[i]!=x)
		{
			i++;
		}
		if(i<n)
		{
			return i;
		}
		
		else
		{
			return (-1);
		}
	}
	
	public int busquedaBinaria(int A[],int n, int x)
	{
		int inicio=0,fin=n,centro;
		centro=(fin+inicio)/2;
		while(inicio<=fin&&x!=A[centro])
		{
			if(x>A[centro])
			{
				inicio=centro+1;
			}
			else
			{
				fin=centro-1;
			}
			centro=(inicio+fin)/2;	
		}
		if(inicio>fin)
		{
			return (-1);
		}
		else
		{
			return centro;
		}
		
	}
}
