package selectivas;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class algoritmo {
	
	/**
	 * 
	 * @param solves a first degree equation
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		float a,b,x;
		
		try
		{	
			System.out.println("type the value of a: ");
			a = Integer.parseInt(br.readLine());
			
			System.out.println("type the value of b: ");
			b = Integer.parseInt(br.readLine());
			
			if (a != 0)
			{
				x = -b /a;
			}
			else
			{
				x = 0;
			}			
			
			System.out.println(" ");
			System.out.println("the result is: " + x);
			
		}
		catch(Exception ex) 
		{
			
		}
	}
}