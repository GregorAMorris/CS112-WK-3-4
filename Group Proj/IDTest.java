import static org.junit.Assert.*;
import org.junit.Test;

public class IDTest {
    @Test
    public void test(){
        assertSame(TaxiCompany.getBookingId(), Passenger.getID());
    }

}
