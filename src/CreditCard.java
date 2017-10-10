
public class CreditCard {
	//instance vars; not shared among instances of the class
	private String Customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;
	
	//Constructors:
	//this is the basic one, allowing it to have a balance of 0
	public CreditCard(String name, String bankName, String accNum, int maxCred){
		this(name, bankName, accNum, maxCred,0.0);
	}
	
	public CreditCard(String name, String bankName, String accNum, int maxCred, double bal){
		Customer = name;
		bank = bankName;
		account = accNum;
		limit = maxCred;
		balance = bal;
		}
	//Accessor methods:
	public String getCustomer(){return Customer;}
	public String getBank(){return bank;}
	public String getAcc(){return account;}
	public int getLimit(){return limit;}
	public double getBal(){return balance;}
	
	//Update methods:
	public void payment(double amount){
		balance -=amount;
	}
	
	public boolean charge(double price){
		if(price + balance > limit){
			return false;
		}
		balance+=price;
		return true;
	}
	
	public static void Summary(CreditCard card){
		System.out.println("Customer =" + card.Customer);
		System.out.println("Bank =" + card.bank);
		System.out.println("Account ="+ card.account);
		System.out.println("Balance =" + card.balance);
		System.out.println("Limit ="+ card.limit);
	}
}
