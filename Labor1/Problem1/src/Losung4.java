public class Losung4
{
    static int solve(int[] noten)
    {
        int maximalRoundedNote = 0;
        for (int note : noten)
        {
            // Calculate the next multiple of 5
            int lastMultipleOf5 = (note / 5) * 5;
            int nextMultipleOf5 = lastMultipleOf5 + 5;
            if (note >= nextMultipleOf5 - 3) note = nextMultipleOf5;
            if (note > maximalRoundedNote) maximalRoundedNote = note;
        }
        return maximalRoundedNote;
    }
}
