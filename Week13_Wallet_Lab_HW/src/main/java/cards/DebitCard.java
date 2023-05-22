package cards;

import payment.Chargeable;

public class DebitCard extends PaymentCard implements Chargeable {

     private int accountNumber;
     private int sortCode;

     public DebitCard(int cardNumber, String expiryDate, int securityNo, int accountNumber, int sortCode){
         super(cardNumber, expiryDate, securityNo);
         this.accountNumber = accountNumber;
         this.sortCode = sortCode;
     }


    public void charge(double transactionAmount) {
        this.logTransaction(String.format("You paid %s for some junk", transactionAmount));
    }
}
