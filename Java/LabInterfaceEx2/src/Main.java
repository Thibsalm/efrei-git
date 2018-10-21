
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountBusinessCard card = new BankAccountBusinessCard();
		card.setName("John");
		card.setSurname("Wick");
		card.setCity("Bourg-La-Reine");
		card.setPhone("92340");
		card.setAccount("444444444444444444444444444");
		card.print();
		
		BusinessCard card2 = new BusinessCard();
		card2.setName("John");
		card2.setSurname("Wick");
		card2.setCity("Bourg-La-Reine");
		card2.setPhone("92340");
		card2.print();
	}

}
