class Account {
    protected static int accountCount = 0; // Class variable
    protected int number;
    protected String name;
    protected double balance;

    public Account(int number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        accountCount++;
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
}

class SavingsAccount extends Account {
    private double interestRate;

    // Parameterized constructor
    public SavingsAccount(int number, String name, double balance, double interestRate) {
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
}

class lab20Driver {
    public static void main(String[] args) {
		SavingsAccount sa1 = new SavingsAccount(101, "Sumit Payan", 1000.0, 7.5);
		SavingsAccount sa2 = new SavingsAccount(102, "Dinesh Devariya", 12500.0, 12.5);
		sa1.showBalance();
        sa1.deposit(500);
        sa1.withdraw(300);
		sa1.calculateInterest();
		sa2.showBalance();
        sa2.deposit(9075);
        sa2.withdraw(7500);
        sa2.calculateInterest();
    }
}
