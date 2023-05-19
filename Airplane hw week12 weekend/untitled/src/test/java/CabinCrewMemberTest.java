import crew.CabinCrewMember;
import crew.Rank;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinMember;

    @Test
    public void hasRank(){
        cabinMember = new CabinCrewMember("Geri", Rank.FLIGHT_ATTENDANT);
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinMember.getRank());
    }
}
