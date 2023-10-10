import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung2Test
{
    @Test
    void testExpectedCase()
    {
        // Example 1
        int [] number1 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int [] number2 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int [] result = Losung2.solve(number1, number2); // result should be [2, 9, 0, 0, 0, 0, 0, 0, 0]
        assertEquals(2, result[0]);
        assertEquals(9, result[1]);
        for (int i = 2; i < result.length; i++)
        {
            assertEquals(result[i], 0);
        }
    }

    @Test
    void testUnexpectedCase()
    {
        int [] number1 = {4, 8};
        int [] number2 = {3, 3};
        int [] result = Losung1.solve(number1, number2); // result should be [1, 5]
        assertNotEquals(result[0], 5);
        assertNotEquals(result[1], 2);
    }
}