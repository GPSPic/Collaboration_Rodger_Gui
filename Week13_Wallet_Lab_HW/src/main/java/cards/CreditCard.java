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

    public double
    
    public void charge(double transactionAmount) {

    }
}
