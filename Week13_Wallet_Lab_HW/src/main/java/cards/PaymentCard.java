package cards;

import java.util.ArrayList;

public abstract class PaymentCard {

    private int cardNumber;
    private String expiryDate;
    private int securityNo;
    private ArrayList<String> transactions;

    public PaymentCard(int cardNumber, String expiryDate, int securityNo) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNo = securityNo;
        this.transactions = new ArrayList<>();
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNo() {
        return securityNo;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public void logTransaction(String transaction) {
        this.transactions.add(transaction);
    }

}
