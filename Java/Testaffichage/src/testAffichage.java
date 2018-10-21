
public class testAffichage {
	public static void main(String[] args)
	{
		int length = 41;
		//System.out.println("***************************");
		for(int i=0; i<length; i++)
		{
			System.out.print("*");
		}
	    
	    for(int j=0; j<10; j++)
	    {
	        if(j<9)
	        {
	        	System.out.println("*");
	        	if(j == (length-1))
				{
					System.out.print("*");
				}
	        }
	        else
	        {
	        	System.out.println("*");
	        	if(j == (length-1))
				{
					System.out.print("*");
				}
	        }
	    }
	        	
	}

}
