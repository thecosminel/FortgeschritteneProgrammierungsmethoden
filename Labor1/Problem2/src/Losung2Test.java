import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung2Test
{
    @Test
    void testExpectedCase()
    {
        int [] numbers = {4, 1, 3, 6, 9, 2, 5};
        int result = Losung2.solve(numbers);
        assertEquals(result, 1);
    }

    @Test
    void testUnexpectedCase()
    {
        int [] numbers = {1, 3, 6, 9, 2, 5};
        int result = Losung2.solve(numbers);
        assertNotEquals(result, 8);
    }
}