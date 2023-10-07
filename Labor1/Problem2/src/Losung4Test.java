import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung4Test
{
    @Test
    void testExpectedCase()
    {
        int [] numbers = {1, 3, 6, 9, 2, 5};
        int result = Losung4.solve(numbers);
        assertEquals(result, 17);
    }

    @Test
    void testUnexpectedCase()
    {
        int [] numbers = {1, 3, 6, 9, 2, 5};
        int result = Losung4.solve(numbers);
        assertNotEquals(result, 26);
    }
}