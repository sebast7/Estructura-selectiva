package selectivas;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class par_impar {
	
	/**
	 * 
	 * @param determines if a number is a multiple of three and five
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String r;
		int n;
		
		try
		{	
			System.out.println("enter the number: ");
			n=Integer.parseInt(br.readLine());
			
			if (n % 2==0  )
			{
				r = "the number is pair";
			}
			
			else
			{
				r = "the number is odd";
			}

			System.out.println("  ");	
			System.out.println( r );	
		}
		catch(Exception ex) 
		{
			
		}
	}
}