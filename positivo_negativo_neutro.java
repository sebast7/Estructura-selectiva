package selectivas;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class positivo_negativo_neutro {
	
	/**
	 * 
	 * @param determina si un numero es positivo negativo o neutro
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String r =" ";
		int n;
		
		try
		{	
			System.out.println("enter the amount: ");
			n=Integer.parseInt(br.readLine());
			
			if (n>0)
			{
				r = "the number is positive";
			}
			
			if (n<0)
			{
				r = "the number is negative";
			}
			
			if (n==0)
			{
				r = "the neutral number";
			}
			
			
			System.out.println("  ");	
			System.out.println( r );	
		}
		catch(Exception ex) 
		{
			
		}
	}
}