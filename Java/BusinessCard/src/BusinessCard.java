
public class BusinessCard {
	private String firstname; 
	private String lastname;
	private String phone; 
	private String city;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public BusinessCard(String firstname, String lastname, String phone, String city) {
		this.firstname = firstname;
		this.lastname = lastname ;
		this.phone = phone ;
		this.city = city;
	}
	
	public String print()
	{
		String elegantBusinessCard = "";
		int phoneSize = phone.length(); 
		int citySize = city.length();
		int wordSize = phoneSize + citySize +17 ; 
		System.out.println(" " +wordSize);
		
		/*for(int i=0; i<=wordSize+17; i++)
		{
			/*if(i<2)
			{
				System.out.println("*");
			}
			else
			{
				System.out.println("*");
			}*/
			//System.out.print("*");
		//}
		/*for(int j=0; j<4; j++)
	    {
	        if(j<4)
	        {
	        	System.out.print("*");
	        }
	        else
	        {
	        	System.out.print("*");
	        }*/
	    //}
		//System.out.println("***************************");
		for(int i=0; i<wordSize; i++)
		{
			System.out.print("*");
		}
	    
	    for(int j=0; j<10; j++)
	    {
	        if(j<9)
	        {
	        	System.out.println("*");
	        	if(j == (wordSize-1))
				{
					System.out.print("*");
				}
	        }
	        else
	        {
	        	System.out.println("*");
	        	if(j == (wordSize-1))
				{
					System.out.print("*");
				}
	        }
	    }

	            
		/*System.out.println("");
		elegantBusinessCard += firstname + " " + lastname;
		elegantBusinessCard += "\n";
		elegantBusinessCard += "Phone : " + phone + ", " + "City : " + city;*/
		return elegantBusinessCard; 
		
		// Pour un void method //
		/*System.out.println(firstname + " " +lastname);
		System.out.println("\n");
		System.out.println("Phone: " + phone + ", " + "City : " + city);*/
	}

}

