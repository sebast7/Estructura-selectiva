package selectivas;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class numeromayor {
	
	/**
	 * 
	 * @param given whole numbers shows the largest number
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=0,c=0,m=0;
		
		try
		{	
			System.out.println("enter the amount: ");
			c=Integer.parseInt(br.readLine());
			
			for ( int i = 0; i < c; i++)
			{
			
			System.out.println("enter the number: ");
			n=Integer.parseInt(br.readLine());
			
			}
			
			if (n>m)
			{
				m = n;
			}
			
			System.out.println("  ");	
			System.out.println("the largest number is: " + m);	
		}
		catch(Exception ex) 
		{
			
		}
	}
}