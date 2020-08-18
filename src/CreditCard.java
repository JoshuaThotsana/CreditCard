public class CreditCard {
    //Instance variables:
    private String customer;                // name of the customer (e.g., "Joshua Mabotsa")
    private String bank;                    // name of the bank (e.g., "Standard Bank")
    private String account;                 // account identifier (e.g., "5391 0375 9387 5309")
    private int limit;                      // credit limit (measured in Rands)
    protected double balance;               // current balance (measured in Rands)

    // Constructors:
    /**
     * <p>
     * Constructs a new credit card instance.
     * @param customer      the name of the customer (e.g, "Joshua Mabotsa)
     * @param bank          the name of the bank (e.g., "Standard Bank")
     * @param account       the account identifier (e.g, "5391 0375 9387 5309")
     * @param limit         the credit limit (measured in Rands)
     * @param balance       the initial balance (measured in Rands)
     * </p>
     */
    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }
    public CreditCard(String customer, String bank, String account, int limit) {
        this(customer,bank,account,limit,0.0);              // use a balance of zero as default.
    }

    // Accessor methods:
    public String getCustomer() { return customer;}
    public String getBank() {return bank;}
    public String getAccount() {return account;}
    public int getLimit() {return limit;}
    public double getBalance() {return balance;}

    // Update methods:
    /**
     * Charges the given price to the card, assuming sufficient credit limit.
     * @param price the amount to be charged
     * @return true if charge was accepted; false if charge was denied
     */
    public boolean charge(double price) {                           // make a charge
        if (price + balance > limit) {                              // if charge would surpass limit
            return false;                                           // refuse the charge
        } // at this point the charge is successful.
        balance += price;                                           // update the balance
        return true;                                                // announce the good news
    }

    /**
     * Processes customer payment that reduces balance.
     * @param amount
     */
    public void makePayment(double amount) {                        // make a payment
        balance -= amount;
    }
    
    // Utility method to print a card's information
    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);            // implicit cast
        System.out.println("Limit = " + card.limit);                // implicit cast
    }
}
