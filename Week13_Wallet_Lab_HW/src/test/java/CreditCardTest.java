import cards.CreditCard;
import com.sun.org.apache.xerces.internal.impl.io.UCSReader;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard(0000, "09/09", 000, 500);
    }

    @Test
    public void canCharge(){
        creditCard.charge(200);
        assertEquals(290, creditCard.getAvailableCredit(), 0);
        assertEquals(1, creditCard.getTransactions().size());
    }

    @Test
    public void canAddFee() {
        double modifiedTransaction = creditCard.addFee(200);
        assertEquals(210, modifiedTransaction, 0);
    }

    @Test
    public void canLogTransaction() {
        assertEquals(0, creditCard.getTransactions().size());
    }

    @Test
    public void canReduceCredit() {
        creditCard.reduceCredit(200);
        assertEquals(300, creditCard.getAvailableCredit(), 0);
    }
}
