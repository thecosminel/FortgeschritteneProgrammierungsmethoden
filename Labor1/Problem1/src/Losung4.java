public class Losung4
{
    /**
     * @param noten ist eine [] von Noten
     * @return die maximale abgerundete Note
     */
    static int solve(int[] noten)
    {
        int maximalRoundedNote = 0;
        for (int note : noten)
        {
            // Calculate the next multiple of 5
            int lastMultipleOf5 = (note / 5) * 5;
            int nextMultipleOf5 = lastMultipleOf5 + 5;
            // If "round" condition is meet, round the note
            if (note >= 38 && note + 3 >= nextMultipleOf5) note = nextMultipleOf5;
            // If note > maximalRoundedNote, update maximalRoundedNote
            if (note > maximalRoundedNote) maximalRoundedNote = note;
        }
        return maximalRoundedNote;
    }
}
