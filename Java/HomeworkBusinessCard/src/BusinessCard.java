
public class BusinessCard {
	private String firstname;
	private String name;
	/*private String phone;
	private String city;*/
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*public String getPhone() {
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
	} */
	
	// Constructor of the BusinessCard //
	public BusinessCard(String firstname, String name) {
		this.firstname = firstname;
		this.name = name ;
		/*this.phone = phone ;
		this.city = city; */
	}
	
	public String toString()
	{
		// Initialization of the result to print // 
		String resultat = "";
		
		// Length of the first and second line //
		int size1 = firstname.length() + name.length();
		// int size2 = phone.length() + city.length(); 
		
		// Space after the last word of the first line and second line // 
		String space1 = "";
		String space2 = "";
		
		// Determinate which line is the longest if they are two line//
		/*if(size1 >= size2)
		{*/
			for(int i=0; i<size1+5; i++)
			{
				resultat = resultat += "*";
			}
			// Add a space to the second line if she is least long //
			/*for(int j=0; j<(size1-size2); j++)
			{ */
				//space1 = space1 += " ";
				/*space2 = space2 += " ";
			} */
		//}
		/*else
		{*/
			/*for(int k=0; k<size2+5; k++)
			{
				resultat = resultat += "*";
			}*/
			/*
			for(int h=0; h<(size2-size1); h++)
			{*/
				//space2 = space2 += " ";
				/*space1 = space1 += " ";
			}*/
		//}	
			
		// Return the result //
		return resultat + "\n" + "* " + this.firstname + " " + this.name + space1 + " *" + "\n" + resultat; /*+ this.phone + " " + this.city + space2 +" *" + "\n" + resultat;*/
	}

}
