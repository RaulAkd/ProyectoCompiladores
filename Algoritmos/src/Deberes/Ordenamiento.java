package Deberes;

public class Ordenamiento {
	
	public static void burbuja(int A[],int n)
	{
		int i,j,aux;
		for(i=n-1;i>=1;i--)
		{
			for(j=0;j<i;j++)
			{
				if(A[j]>A[j+1])
				{
					aux=A[j];
					A[j]=A[j+1];
					A[j+1]=aux;
				}
			}
		}
	}

	public static void insercion(int A[],int n)
	{
		int i,j,aux;
		for(i=1;i<n;i++)
		{
			j=i;
			while(A[j]<A[j-1]&&j>=1)
			{
				aux=A[j];
				A[j]=A[j-1];
				A[j-1]=aux;
				j--;
			}
		}
	}
	
	public static void seleccion(int A[],int n)
	{
		int i,j,aux,menor;
		for(i=0;i<n-1;i++)
		{
			menor=i;
			for(j=n-1;j>=i;j--)
			{
				if(A[j]<A[menor])
				{
					menor=j;
				}
			}
			aux=A[menor];
			A[menor]=A[i];
			A[i]=aux;
		}
	}
	
	public static void imprimir(int A[], int n)
	{
		System.out.println("");
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+"\t");
		}
	}

}
