import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Losung4Test
{
    @Test
    void testExpectedCase()
    {
        int [] notes = {13, 12 ,37, 49, 29, 87};
        int solution = Losung4_findHighestGrade.solve(notes);
        assertEquals(solution, 90);
    }

    @Test
    void testUnexpectedCase()
    {
        int [] notes = {13, 12 ,37, 49, 29, 87};
        int solution = Losung4_findHighestGrade.solve(notes);
        // Note should be rounded to 90
        assertNotEquals(solution, 87);
    }
}