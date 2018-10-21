import java.util.ArrayList;

public class BankAccountBusinessCard extends BusinessCard{
	private String account;
	
	public String getAccount() {
		return account;
	}
	
	public void setAccount(String account)
	{
		this.account = account;
	}
	
	protected ArrayList<String> getLines() {
		ArrayList<String> lines = super.getLines();
		lines.add("Bank account: " +account);
		return lines;
	}

}
