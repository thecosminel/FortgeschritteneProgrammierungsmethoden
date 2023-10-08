import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung4Test
{
    @Test
    void testExpectedCase()
    {
        int [] keyboard_prices = {40, 50, 60};
        int [] usb_prices = {8, 12};
        int budget = 60;
        int result = Losung4.solve(keyboard_prices, usb_prices, budget);
        assertEquals(result, 48);
    }

    @Test
    void testUnexpectedCase()
    {
        int [] keyboard_prices = {40, 50, 60};
        int [] usb_prices = {8, 12};
        int budget = 60;
        int result = Losung4.solve(keyboard_prices, usb_prices, budget);
        assertNotEquals(result, 72);
    }
}