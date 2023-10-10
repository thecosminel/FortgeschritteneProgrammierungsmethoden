import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung1Test
{
    @Test
    void testExpectedCase()
    {
        int [] numbers = {1, 3, 6, 9, 2, 5};
        int result = Losung1.solve(numbers);
        assertEquals(result, 9);
    }

    @Test
    void testUnexpectedCase()
    {
        int [] numbers = {1, 3, 6, 9, 2, 5};
        int result = Losung1.solve(numbers);
        assertNotEquals(result, 8);
    }
}