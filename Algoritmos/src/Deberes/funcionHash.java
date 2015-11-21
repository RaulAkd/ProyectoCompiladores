package Deberes;

public class funcionHash {
	
	public static int modulo(int clave, int n)
	{
		return (clave%n);
	}

	public static int hashCuadrado(int clave, int n)
	{
		String cadena;
		int tamano, n1=0,n2 = 0, aux;
		aux=clave;
		clave=clave*clave;
		System.out.println("Cuadrado:"+clave);
		cadena=Integer.toString(clave);
		if(aux<10)
		{
			n1=Integer.parseInt(cadena.substring((cadena.length()-1)/2, ((cadena.length()-1)/2)+1));
			System.out.println("n1:"+n1);
		}
		else
		{
			n1=Integer.parseInt(cadena.substring((cadena.length()-1)/2, ((cadena.length()-1)/2)+1));
			n2=Integer.parseInt(cadena.substring(((cadena.length()-1)/2)+1, ((cadena.length()-1)/2)+2));
			System.out.println("n1:"+n1+"n2:"+n2);
		}
		
		if(n<=10)
		{
			return n1;
		}
		
		else
		{
			if(aux<10)
			{
				return n1;
			}
			else 
			{
				return ((n1*10)+n2);
			}
		}
		
	}
	
	public static int plegamiento(int clave, int n)
	{
		int suma=0,i;
		String cadena=Integer.toString(clave);
		if(clave<10)
		{
			return clave;
		}
		else if(clave<100)
		{
			return (Integer.parseInt(cadena.substring(0, 1))+Integer.parseInt(cadena.substring(1, 2)));
		}
		else
		{
			if(cadena.length()%2==0)
			{
				for(i=0;i<cadena.length()-1;i=i+2)
				{
					suma=suma+Integer.parseInt(cadena.substring(i, i+2));
				}
				System.out.println("Par: suma="+suma);
			}
			else
			{
				for(i=0;i<cadena.length()-2;i=i+2)
				{
					suma=suma+Integer.parseInt(cadena.substring(i, i+2));
				}
				suma=suma+Integer.parseInt(cadena.substring(cadena.length()-1, cadena.length()));
				System.out.println("Impar: suma="+suma);
			}
		}
		cadena=Integer.toString(suma);
		if(n<=10)
		{
			System.out.println("n menor a 10");
			return Integer.parseInt(cadena.substring(cadena.length()-2, cadena.length()-1));
		}
		else
		{
			System.out.println("n mayor a 10");
			return Integer.parseInt(cadena.substring(cadena.length()-2, cadena.length()));
		}
		
	}
	
	public static int truncamiento(int clave, int n)
	{
		int i=0,tam=0;
		String cadena=Integer.toString(clave);
		String cadenaD="";
		if(clave<100)
		{
			if(n<=10)
			{
				//System.out.println("n menor a 10");
				return clave;
			}
			else
			{
				return Integer.parseInt(cadena.substring(0));
			}
		}
		else
		{
			if(n<=10)
			{
				//System.out.println("n menor a 10");
				return Integer.parseInt(cadena.substring(0));
			}
			else
			{
				do
				{
					for(i=0;i<cadena.length();i=i+2)
					{
						cadenaD+=""+cadena.substring(i, i+1);
						System.out.println("Cadena="+cadenaD);
					}
					System.out.println("Cadena inicial="+cadena);
					cadena=cadenaD;
					System.out.println("Cadena1="+cadena);
					System.out.println("Cadena2="+cadenaD);
					tam=cadenaD.length();
					cadenaD="";
				}
				while(tam>2);
				System.out.println("Cadena="+cadena);
				return Integer.parseInt(cadena);
			}
		}
	}
}
