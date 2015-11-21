package Deberes;

import java.util.ArrayList;
import java.util.Scanner;


public class tablasHash {

	static int opcionF;
	static int opcionC;
	static int tamano;
	static int direccion, nuevaDireccion, aux;
	static int i=0, cont=0, cont2=0;
	static int vectorClaves[]=new int[100];
	//static ArrayList<Integer> vector=new ArrayList<Integer>();
	static String clave;
	static funcionHash hash=new funcionHash();
	static solucionColision colision=new solucionColision();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vector.add(5,2);
		//vectorClaves[2]=7;
		tamano=Integer.parseInt(ingresoTeclado("Ingrese el numero de claves a ingresar"));
		System.out.println("\nFunciones Hash\n1.Hash por modulo\n2.Hash cuadrado\n3.Hash por plegamiento\n4.Hash por truncamiento");
		opcionF=Integer.parseInt(ingresoTeclado("Escoja la funcion a aplicar"));
		System.out.println("\nSolucion de Colisiones\n1.Prueba Lineal\n2.Prueba Cuadratica\n3.Doble direccion Hash\n4.Arreglos anidados");
		opcionC=Integer.parseInt(ingresoTeclado("Escoja la solucion para colisiones"));
		
		switch(opcionF)
		{
			case 1:
				for(i=1;i<=tamano;i++)
				{
					clave=ingresoTeclado("Ingrese clave");
					direccion=hash.modulo(Integer.parseInt(clave), tamano);
					System.out.println("direccion:"+direccion);
					while(vectorClaves[direccion]!=0)
					{
						System.out.println("colision");
						direccion=colision.pruebaLineal(direccion,tamano);
						System.out.println("nuevaDireccion:"+direccion);
						//   vectorClaves[direccion]=Integer.parseInt(clave);
					}
					vectorClaves[direccion]=Integer.parseInt(clave);
				}
			break;	
			case 2:
				for(i=1;i<=tamano;i++)
				{
					clave=ingresoTeclado("Ingrese clave");
					direccion=hash.hashCuadrado(Integer.parseInt(clave), tamano);
					System.out.println("direccion:"+direccion);
					aux=direccion;
					while(vectorClaves[direccion]!=0||direccion>=tamano)//nuevaDireccion>=tamano)||vectorClaves[nuevaDireccion]!=0)
					{
						if(direccion>=tamano)
						{
							cont=0;
							//cont2=cont2+1;
							aux=cont2++;
						}
						System.out.println("colision");
						direccion=colision.pruebaCuadratica(aux,tamano,cont,cont2);
						System.out.println("nuevaDireccion:"+direccion);
						//   vectorClaves[direccion]=Integer.parseInt(clave);
						cont++;
					}
					
					vectorClaves[direccion]=Integer.parseInt(clave);
					cont=0;
					cont2=0;
				}
			break;	
			
			case 3:
				for(i=1;i<=tamano;i++)
				{
					clave=ingresoTeclado("Ingrese clave");
					direccion=hash.plegamiento(Integer.parseInt(clave),tamano);
					System.out.println("direccion:"+direccion);
					
					while(vectorClaves[direccion]!=0)
					{
						System.out.println("colision");
						direccion=colision.pruebaLineal(direccion,tamano);
						System.out.println("nuevaDireccion:"+direccion);
					}
					
					vectorClaves[direccion]=Integer.parseInt(clave);
				}
			break;
			case 4:
				for(i=1;i<=tamano;i++)
				{
					clave=ingresoTeclado("Ingrese clave");
					direccion=hash.truncamiento(Integer.parseInt(clave),tamano);
					System.out.println("direccion:"+direccion);
					
					while(vectorClaves[direccion]!=0)
					{
						System.out.println("colision");
						direccion=colision.pruebaLineal(direccion,tamano);
						System.out.println("nuevaDireccion:"+direccion);
					}
					
					vectorClaves[direccion]=Integer.parseInt(clave);
				}
		}
		for(i=0;i<tamano;i++)
		{
			System.out.print(vectorClaves[i]+" ");
		}
	}

	public static String ingresoTeclado(String mensaje)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(mensaje);
		return in.nextLine();
	}
}
