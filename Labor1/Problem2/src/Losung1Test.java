import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung1Test
{
    @Test
    void testExpectedCase()
    {
        // Example 1
        int [] number1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int [] number2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int [] result = Losung1.solve(number1, number2); // result should be [1, 0, 0, ... 0]
        assertEquals(1, result[0]);
        for (int i = 1; i < result.length; i++) 
        {
            assertEquals(result[i], 0);
        }
        // Example 2
        int [] nr1 = {2, 8};
        int [] nr2 = {3, 3};
        int [] function_result = Losung1.solve(nr1, nr2); // result should be [6, 1]
        assertEquals(function_result[0], 6);
        assertEquals(function_result[1], 1);
    }

    @Test
    void testUnexpectedCase()
    {
        int [] number1 = {2, 8};
        int [] number2 = {3, 3};
        int [] result = Losung1.solve(number1, number2); // result should be [6, 1]
        assertNotEquals(result[0], 5);
        assertNotEquals(result[1], 2);
    }
}