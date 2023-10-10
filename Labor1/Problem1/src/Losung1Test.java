import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung1Test
{
    @Test
    void testExpectedCase()
    {
        int [] notes = {13, 12 ,37, 49};
        int [] solutions = Losung1.solve(notes);
        assertEquals(solutions.length, 3);
        assertEquals(solutions[0], 13);
        assertEquals(solutions[1], 12);
        assertEquals(solutions[2], 37);
    }

    @Test
    void testUnexpectedCase()
    {
        int [] notes = {13, 12 ,37, 49};
        int [] solutions = Losung1.solve(notes);
        for (int note : solutions)
        {
            assertNotEquals(note, 49);
        }
    }
}