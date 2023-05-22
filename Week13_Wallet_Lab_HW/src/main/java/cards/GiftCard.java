package cards;
import payment.Chargeable;

public class GiftCard implements Chargeable {

    private double balance;

    public GiftCard(double balance){
        this.balance = balance;
    }

    public void charge(double transactionAmount) {
        if (this.balance >= transactionAmount){
            this.balance -= transactionAmount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
