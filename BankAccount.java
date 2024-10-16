class BankAccount {
    private double balance;

    // Constructor to initialize account with an initial balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to check the balance
    public double checkBalance() {
        return this.balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: ₹"+amount);
        } else {
            System.out.println("Invalid amount. Deposit must be greater than zero.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: ₹"+amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Cannot withdraw ₹"+amount);
        } else {
            System.out.println("Invalid amount. Withdrawal must be greater than zero.");
        }
    }
}
