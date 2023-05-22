import cards.CreditCard;
import cards.DebitCard;
import cards.GiftCard;
import org.junit.Before;
import org.junit.Test;
import payment.Chargeable;
import payment.Wallet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class WalletTest {

    Wallet wallet;
    GiftCard giftCard;
    DebitCard debitCard;
    CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard(0000, "09/09", 000, 500);
        debitCard = new DebitCard(12345, "05/23", 543, 9600, 20);
        giftCard = new GiftCard(50);
        wallet = new Wallet();
        wallet.addCardsToWallet(creditCard);
        wallet.addCardsToWallet(debitCard);
        wallet.addCardsToWallet(giftCard);
    }

    @Test
    public void canAddCards() {
        wallet.addCardsToWallet(creditCard);
        wallet.addCardsToWallet(debitCard);
        assertEquals(5, wallet.getChargeables().size());
    }

    @Test
    public void canSelectChargeable() {
        wallet.setSelectedChargeable(giftCard);
        assertEquals(giftCard, wallet.getSelectedChargeable());
    }

    @Test
    public void selectedChargeableStartsEmpty() {
        assertNull(wallet.getSelectedChargeable());
    }

    @Test
    public void canPayWithSelectedCard() {
        wallet.pay(20, creditCard);
        assertEquals(479, creditCard.getAvailableCredit(), 0);
        assertEquals(1, creditCard.getTransactions().size());
        wallet.pay(20, debitCard);
        assertEquals(1, debitCard.getTransactions().size());
        wallet.pay(20, giftCard);
        assertEquals(30, giftCard.getBalance(), 0);
    }

}
