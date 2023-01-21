package em3;

abstract class Account{
	private int accno;
	private String name;
	double balance;
	
	public Account(int accno, String name, double balance) {
		this.accno=accno;
		this.name = name;
		this.balance = balance;
	}
	
	public int getAccno() {
		return accno;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract boolean checkMinBalance();
}

class CurrentAccount extends Account{
	private static float min_balance;
	static {
		min_balance = 5000;
	}
	
	public CurrentAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}
	
	public boolean checkMinBalance() {
		if(this.balance>min_balance)
			return true;
		else
			return false;
	}
}

class SavingsAccount extends Account{
	private static float min_balance;
	static {
		min_balance = 1000;
	}
	
	public SavingsAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}
	public boolean checkMinBalance() {
		if(this.balance>min_balance)
			return true;
		else
			return false;
	}
	
}

public class Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Account[] accounts = new Account[5];
			accounts[0] = new SavingsAccount(10212,"Sayali",500);
			accounts[1] = new CurrentAccount(10234,"Bakul",6000);
			accounts[2] = new CurrentAccount(72311,"Rahul",1000);
			accounts[3] = new SavingsAccount(767623,"Trupti",9000);
			accounts[4] = new SavingsAccount(23244,"Vishaka",800);
			
			System.out.println("List of Account Holders having inssufficient balance: ");
			
			for(int i =0; i<accounts.length;i++) {
				if(!accounts[i].checkMinBalance())
					System.out.println(accounts[i].getAccno()+":"+accounts[i].getName());
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
