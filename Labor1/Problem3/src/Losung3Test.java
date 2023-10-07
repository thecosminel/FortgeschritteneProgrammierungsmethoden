import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung3Test
{
    @Test
    void testExpectedCase()
    {
        int [] number1 = new int[] {2, 3, 1};
        int number3 = 7;
        int [] result = Losung3.solve(number1, number3); // [1, 6 ,1 , 7]
        assertEquals(result[0], 1);
        assertEquals(result[1], 6);
        assertEquals(result[2], 1);
        assertEquals(result[3], 7);
    }

    @Test
    void testUnexpectedCase()
    {
        int [] number1 = new int[] {2, 3, 1};
        int number3 = 7;
        int [] result = Losung3.solve(number1, number3); // [1, 6 ,1 , 7]
        assertNotEquals(result[0], 2);
        assertNotEquals(result[1], 1);
        assertNotEquals(result[2], 3);
        assertNotEquals(result[3], 8);
    }
}