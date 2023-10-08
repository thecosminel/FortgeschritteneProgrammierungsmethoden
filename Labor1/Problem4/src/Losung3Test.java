import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung3Test
{
    @Test
    void testExpectedCase()
    {
        int [] usb_prices = {15, 45, 20};
        int budget = 30;
        int result = Losung3.solve(usb_prices, budget);
        assertEquals(result, 20);
    }

    @Test
    void testUnexpectedCase()
    {
        int [] usb_prices = {15, 45, 20};
        int budget = 30;
        int result = Losung3.solve(usb_prices, budget);
        assertNotEquals(result, 45);
    }
}