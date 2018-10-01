package selectivas;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class descuento {
	
	/**
	 * 
	 * @param a restaurant offers a discount of 10% for consumptions up to $ 100 and a discount of 20% for major consumptions. 
	 * For both cases a tax of 19% is applied. Determine the amount of the discount, the tax and the amount to pay
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
	
		float D1 = (float) 0.1;
		float D2 = (float) 0.2;
		float IV = (float) 0.19;
		float c,md,i,p;
		
		try
		{	
			System.out.println("type the consumption: ");
			c=Integer.parseInt(br.readLine());
			
			if (c <=  100)
			{
				md = c * D1;						
			}
			else
			{
				md = c * D2;
			}
			
			i = ( c - md ) * IV;
			p = (c - md  + i);
			
			System.out.println(" ");
			System.out.println("Discount amount: " + md);
			System.out.println("Tax to pay: " + i);
			System.out.println("amount to pay: " + p);
			
		}
		catch(Exception ex) 
		{
			
		}
	}
}