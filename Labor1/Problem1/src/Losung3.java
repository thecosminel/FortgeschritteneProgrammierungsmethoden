public class Losung3
{
    /**
     * @param noten ist eine [] von Noten
     * @return [] mit abgerundeten Noten
     */
    static int[] solve(int[] noten)
    {
        for (int i = 0; i < noten.length; i++)
        {
            int note = noten[i];
            // Calculate the next multiple of 5
            int lastMultipleOf5 = (note / 5) * 5;
            int nextMultipleOf5 = lastMultipleOf5 + 5;
            // If "round" condition is meet, round the note
            if (note >= 38 && note + 3 >= nextMultipleOf5) noten[i] = nextMultipleOf5;
        }
        return noten;
    }
}
