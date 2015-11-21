package Deberes;
import java.util.Scanner;

public class buscarPatrones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generarVector vectorSiguiente=new generarVector();
		String patron;
		int vector[]=new int[20];
		patron=ingresoTeclado("Ingrese un patron");
		vector=vectorSiguiente.preKmp(patron, vector);
		for(int i=0;i<patron.length();i++)
		{
			System.out.print(vector[i]+" ");
		}
	}

	public static String ingresoTeclado(String mensaje)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(mensaje);
		return in.nextLine();
	}
}
