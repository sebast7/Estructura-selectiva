package selectivas;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class algoritmo_raices {
	
	/**
	 * 
	 * @param an algorithm that obtains the real roots of a second degree equation 
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		double a,b,c,d,x1,x2;
		
		try
		{	
			System.out.println("type the value of a: ");
			a = Integer.parseInt(br.readLine());
			
			System.out.println("type the value of b: ");
			b = Integer.parseInt(br.readLine());
			
			System.out.println("type the value of c: ");
			c = Integer.parseInt(br.readLine());
			
			d = Math.pow(b, 2.0) - 4.0 * a * c;
			
			if (a != 0 && d > 0 )
			{
				x1 = (- b + Math.pow (d, (1.0 / 2.0 ))) / 2 * a;
				x2 = (- b - Math.pow (d, (1.0 / 2.0))) / 2 * a;
			}
			else
			{
				x1 = 0;
				x2 = 0;
			}
			
			System.out.println(" ");
			System.out.println("the result of x1 is: " + x1);
			System.out.println("the result of x2 is: " + x2);
			
		}
		catch(Exception ex) 
		{
			
		}
	}
}