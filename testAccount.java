import java.util.Scanner;

class Account {
    protected static int accountCount = 0; // Class variable
    protected long number;
    protected String name;
    protected double balance;

    public Account(long number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        accountCount++;
    }
	
	public long getNumber(){return number;}
	public String getName(){return name;}
	public double getBalance(){return balance;}
	
	public void setNumber(long _number){
		number = _number;
	}
	
	public void setName(String _name){
		name = _name;
	}
	
	public void setBalance(double _balance){
		balance = _balance;
	}

	public void showBalance(){
		System.out.print("Balance of "+name+ " is:"+balance);
		System.out.println();
	}
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " New Balance: " + balance);
			System.out.print("");
        } else {
            System.out.println("Invalid deposit amount.");
			System.out.print("");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " New Balance: " + balance);
			System.out.print("");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
			System.out.print("");
		}
    }
	
	public String toString(){
		String str;
		str = "Account number: " + number + "\t";
		str += "holder name: " + name + "\t";
		str += "Balance: " + balance + "\t";
		return str;
	}
}

class savingsAccount extends Account {
    private double interestRate;

    // Parameterized constructor
    public savingsAccount(long number, String name, double balance, double interestRate) {
        super(number, name, balance);
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest + " New Balance: " + balance);
		System.out.print("");
    }
	
	public String toString(){
		String str;
		str = "Account type: savingsAccount\t";
		str += "Account number: " + number + "\t";
		str += "holder name: " + name + "\t";
		str += "Balance: " + balance + "\t";
		return str;
	}
}

class checkingAccount extends Account{
	protected int fees;
	
	public checkingAccount(long number, String name, double balance ){
		super(number, name, balance);
		fees = 5;
	}
	
	public void deposit(double amount){
		if (amount > 5 ){
			balance += amount;
			balance -= fees;
			System.out.println("Amount: " + amount + " is a to your account, new balance is " + balance);
		}else{
			System.out.println("Deposit is not possible");
		}
	}
	
	public void withdraw(double amount){
		if (amount < balance && amount > 5){
			balance -= amount;
			balance -= fees;
			System.out.println("Amount: " + amount + " is withdrawed to your account, new balance is "+ balance);
		}else{
			System.out.println("Invalid balance or insufficient funds");
		}
	}
	
	public String toString(){
		String str;
		str = "Account type: checking account\t";
		str += "Account number: " + number + "\t";
		str += "holder name: " + name + "\t";
		str += "Balance: " + balance + "\t";
		return str;
	}
}

class testAccount {
    public static void main(String[] args) {
		Account ac = new Account(1012012, "SaaD",25000);
		System.out.println(ac);
		Scanner scn = new Scanner(System.in);
		int rep;
		do{
			System.out.print("Enter account type (1/2)\n 1) For savings account\n 2) For checking Account\n Enter your choice:");
			int choice = scn.nextInt();
			
			if (choice == 1){
				savingsAccount sa = new savingsAccount(10120120, "Sumit", 12500, 12.5);
				System.out.println(sa);
				sa.calculateInterest();
				
			}else if (choice == 2){
				checkingAccount ca = new checkingAccount(101120121, "Dinesh", 13600);
				System.out.println(ca);
			}else{
				System.out.println("Invalid choice");
			}
			
			System.out.print("Do you want to continue (1/0):");
			rep = scn.nextInt();
		}while (rep == 1);
		
    }
}
