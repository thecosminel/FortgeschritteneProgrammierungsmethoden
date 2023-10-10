import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung1Test
{
    @Test
    void testExpectedCase()
    {
        int [] keyboard_prices = {40, 35, 70, 15, 45};
        int result = Losung1.solve(keyboard_prices);
        assertEquals(result, 15);
    }

    @Test
    void testUnexpectedCase()
    {
        int [] keyboard_prices = {40, 35, 70, 15, 45};
        int result = Losung1.solve(keyboard_prices);
        assertNotEquals(result, 70);
    }
}