import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung3Test
{
    @Test
    void testExpectedCase()
    {
        int [] notes =          {13, 37, 68, 81, 83};
        int [] expectedNotes =  {13, 37, 70, 81, 85};
        int [] solutions = Losung3.solve(notes);
        // Check notes == expectedNotes
        for (int i = 0; i < notes.length; i++)
        {
            assertEquals(solutions[i], expectedNotes[i]);
        }
    }

    @Test
    void testUnexpectedCase()
    {
        int [] notes =          {13, 37, 68, 81, 83};
        int [] expectedNotes =  {15, 40, 68, 85, 80};
        int [] solutions = Losung3.solve(notes);
        // Check notes != expectedNotes
        for (int i = 0; i < notes.length; i++)
        {
            assertNotEquals(solutions[i], expectedNotes[i]);
        }
    }
}