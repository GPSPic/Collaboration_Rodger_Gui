import cards.GiftCard;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftCard;

    @Test
    public void canCharge(){
        giftCard = new GiftCard(50);
        giftCard.charge(25);
        assertEquals(25, giftCard.getBalance(), 0);
    }

}
