
public class BusinessCardDemo {
	public static void main(String[] args) {
		BusinessCard john = new BusinessCard("John", "Snow", "0123456", "Poland");
		john.setFirstname("John");
		System.out.println(john.getFirstname());
		
		BusinessCard kate = new BusinessCard("Kate", "middleton", "0608120811", "Bourg-La-Reine");
		System.out.println(kate.getFirstname() + " " + kate.getCity());
		
		 String printed = kate.print();
		System.out.println(printed);
		
		// Pour un void //
		// kate.print() ; //
		
		
		
		
	}

}
