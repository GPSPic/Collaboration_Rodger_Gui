import crew.Pilot;
import crew.Rank;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Test
    public void hasRank() {
        pilot = new Pilot("Bob", Rank.PILOT, "AAA");
        assertEquals(Rank.PILOT, pilot.getRank());
    }

}
