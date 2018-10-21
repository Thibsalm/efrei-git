
public class MapExercise01 {

	public static void main(String[] args) {
		PhoneBook book = new PhoneBook();
		book.addEntry("John", "12234");
		System.out.println(book.findEntry("John"));
		System.out.println(book.existsEntry("John"));
		System.out.println(book.existsEntry("NotExistingJohn"));
		System.out.println(book.checkNumberExists("12234"));
		System.out.println(book.checkNumberExists("0000"));
		System.out.println(book.getOwnerForNumber("12234"));
		System.out.println(book.getOwnerForNumber("0000"));
	}
}
