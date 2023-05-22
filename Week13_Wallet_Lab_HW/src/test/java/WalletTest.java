import cards.CreditCard;
import cards.DebitCard;
import cards.GiftCard;
import org.junit.Before;
import org.junit.Test;
import payment.Chargeable;
import payment.Wallet;

public class WalletTest {

    Wallet wallet;
    Chargeable giftCard;
    Chargeable debitCard;
    Chargeable creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard(0000, "09/09", 000, 500);
        debitCard = new DebitCard(12345, "05/23", 543, 9600, 20);
        giftCard = new GiftCard(50);
        wallet = new Wallet();
        
    }

    @Test
    public void canAddCards
}
