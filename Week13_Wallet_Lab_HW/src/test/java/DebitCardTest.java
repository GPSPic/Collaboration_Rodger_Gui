import cards.DebitCard;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;

    @Test
    public void canCharge(){
        debitCard = new DebitCard(12345, "05/23", 543, 9600, 20);
        debitCard.charge(50);
        assertEquals(1, debitCard.getTransactions().size());
    }
}
