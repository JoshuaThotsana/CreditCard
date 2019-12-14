/**...*/
/**
 * <p>
 * A simple model for a consumer credit card.
 *
 * @author Thotsana Joshua Mabotsa.
 * </p>
 */

public class Main {

    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("Joshua Mabotsa", "Standard Bank", "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("Joshua Mabotsa", "ABSA", "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard("Joshua Mabotsa", "FNB", "5391 0375 9387 5309", 2500, 300);

        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);
        }

        for (CreditCard card : wallet) {
            CreditCard.printSummary(card);              // calling static method
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }
    }

}
