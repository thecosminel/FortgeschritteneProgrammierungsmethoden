public class Losung2
{
    static int solve(int [] noten)
    {
        int average = 0;
        for (int note : noten)
        {
            average += note;
        }
        return average / noten.length;
    }

    public static void testExpectedCase()
    {
        int[] notes = {13, 11, 37, 49};
        int solution = Losung2.solve(notes);
        assert (solution == 55);
    }

    public static void testUnexpectedCase()
    {
        int[] notes = {13, 11, 37, 49};
        int solution = Losung2.solve(notes);
        assert (solution != 65);
    }
}
