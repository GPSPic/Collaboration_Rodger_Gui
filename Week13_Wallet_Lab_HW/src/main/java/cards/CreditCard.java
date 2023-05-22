package cards;

import payment.Chargeable;


public class CreditCard extends PaymentCard implements Chargeable {

    private double availableCredit;

    public CreditCard(int cardNumber, String expiryDate, int securityNo, double availableCredit){
        super(cardNumber, expiryDate, securityNo);
        this.availableCredit = availableCredit;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }

    public void setAvailableCredit(double availableCredit) {
        this.availableCredit = availableCredit;
    }

    public double addFee(double transaction) {
        return transaction += transaction * 0.05;
    }

    public void reduceCredit(double totalPrice) {
        if (this.availableCredit >= totalPrice) {
            this.availableCredit -= totalPrice;
        } else {
            System.out.println("You pauper!");
        }
    }
    
    public void charge(double transactionAmount) {
        double totalPrice = this.addFee(transactionAmount);
        this.reduceCredit(totalPrice);
        this.logTransaction(String.format("You paid %s for some junk", totalPrice));
    }
}
