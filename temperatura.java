package selectivas;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class temperatura {
	
	/**
	 * 
	 * @param when entering the value of a temperature, obtain the type of climate
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t;
		String c;	
		
		try
		{	
			System.out.println("Type the temperature: ");
			t = Integer.parseInt(br.readLine());
			
			if (t < 10)
			{
				c = "COLD";
			}
			else
			{
				if (t >= 10 && t <=20)
				{
					c = "CLOUDY";
				}
				else
				{
					if (t >= 21 && t <=30)
					{
						c = "HOT";
					}
					else
					{
						c = "TROPICAL";
					}
				}
			}
			
			System.out.println(" ");
			System.out.println("The weather is: " + c);
			
		}
		catch(Exception ex) 
		{
			
		}
	}
}