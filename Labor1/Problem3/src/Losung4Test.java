import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class Losung4Test
{
    @Test
    void testExpectedCase()
    {
        int [] number1 = new int[] {2, 3, 6, 0, 0, 0};
        int number2 = 14;
        int [] result = Losung4.solve(number1, number2); // [0, 1, 6, 8, 5, 7]
        assertEquals(result[0], 0);
        assertEquals(result[1], 1);
        assertEquals(result[2], 6);
        assertEquals(result[3], 8);
        assertEquals(result[4], 5);
        assertEquals(result[5], 7);
    }

    @Test
    void testUnexpectedCase()
    {
        int [] number1 = new int[] {2, 3, 6, 0, 0, 0};
        int number2 = 14;
        int [] result = Losung4.solve(number1, number2); // [0, 1, 6, 8, 5, 7]
        assertNotEquals(result[0], 1);
        assertNotEquals(result[1], 2);
        assertNotEquals(result[2], 5);
        assertNotEquals(result[3], 6);
        assertNotEquals(result[4], 7);
        assertNotEquals(result[5], 8);
    }
}