import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung3Test
{
    @Test
    void testExpectedCase()
    {
        int [] numbers = {1, 3, 6, 9, 2, 5};
        int result = Losung3.solve(numbers);
        assertEquals(result, 25);
    }

    @Test
    void testUnexpectedCase()
    {
        int [] numbers = {1, 3, 6, 9, 2, 5};
        int result = Losung3.solve(numbers);
        assertNotEquals(result, 26);
    }
}