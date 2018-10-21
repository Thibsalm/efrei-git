
public class BusinessCard {
	private String firstname;
	private String name;
	private String phone;
	private String city;
	
	
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
	
	public BusinessCard(String firstname, String name, String phone, String city) {
		this.firstname = firstname;
		this.name = name ;
		this.phone = phone ;
		this.city = city;
	}
	
	public String toString()
	{
		String resultat = "";
		// calculer la longueur du bord (haut / bas)
		// ajouter
		// contenu
		// bord inférieur
		// retourner
		
		int size1 = firstname.length() + name.length();
		int size2 = phone.length() + city.length() +21;
		String space1 = "";
		String space2 = "";
		
		if(size1 >= size2)
		{
			for(int i=0; i<size1+3; i++)
			{
				resultat = resultat += "*";
			}
			for(int j=0; j<(size1-size2); j++)
			{
				//space1 = space1 += " ";
				space2 = space2 += " ";
			}
		}
		else
		{
			for(int k=0; k<size2+3; k++)
			{
				resultat = resultat += "*";
			}
			for(int h=0; h<(size2-size1); h++)
			{
				//space2 = space2 += " ";
				space1 = space1 += " ";
			}
		}	
		

		return resultat + "\n" + "* " + this.firstname + " " + this.name + space1 + " *" + "\n" + "* " + "Phone number: " + this.phone + " " + "City: " + this.city + space2 +" *" + "\n" + resultat;
	}

}
