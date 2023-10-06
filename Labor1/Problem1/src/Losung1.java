
public class Losung1
{
    static int[] solve(int [] noten)
    {
        int [] nichtAusreichendeNoten = new int[noten.length];
        int index = 0;
        for (int note : noten)
        {
            if (note < 38)
            {
                nichtAusreichendeNoten[index] = note;
                index++;
            }
        }
        int [] nichtAusreichendeNotenToReturn = new int [index];
        System.arraycopy(nichtAusreichendeNoten, 0, nichtAusreichendeNotenToReturn, 0, index);
        return nichtAusreichendeNotenToReturn;
    }

    public static void testExpectedCase()
    {
        int[] notes = {13, 12, 37, 49};
        int [] solution = Losung1.solve(notes);
        assert(solution.length == 3);
        assert(solution[0] == 13);
        assert(solution[1] == 12);
        assert(solution[2] == 37);
    }

    public static void testUnexpectedCase()
    {
        int[] notes = {13, 12, 37, 49};
        int [] solution = Losung1.solve(notes);
        for (int j : solution)
        {
            assert j == 49;
        }
    }
}
