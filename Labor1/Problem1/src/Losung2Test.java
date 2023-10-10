import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung2Test
{
    @Test
    void testExpectedCase()
    {
        int [] notes = {13, 12 ,37, 49, 29};
        int solution = Losung2.solve(notes);
        assertEquals(solution, 28);
    }

    @Test
    void testUnexpectedCase()
    {
        int [] notes = {13, 12 ,37, 49, 29};
        int solution = Losung2.solve(notes);
        assertNotEquals(25, solution);
    }
}