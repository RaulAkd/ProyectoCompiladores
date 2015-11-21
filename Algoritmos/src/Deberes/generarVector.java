package Deberes;

public class generarVector {

		public static int[] preKmp(String patron, int kmpNext[])
		{
			int i=0, j=0;
			kmpNext[0]=-1;
			j=-1;
			while(i<patron.length()-1)
			{
				while(j>-1&&!(patron.substring(i, i+1).equals(patron.substring(j, j+1))))
				{
					j=kmpNext[j];
				}
				i++;
				j++;
				if(patron.substring(i, i+1).equals(patron.substring(j, j+1)))
				{
					kmpNext[i]=kmpNext[j];
				}
				else
				{
					kmpNext[i]=j;
				}
			}
			
			return kmpNext;
		}
}
