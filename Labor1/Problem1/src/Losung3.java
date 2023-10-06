public class Losung3
{
    static int[] solve(int[] noten)
    {
        for (int i = 0; i < noten.length; i++)
        {
            int note = noten[i];
            // Calculate the next multiple of 5
            int lastMultipleOf5 = (note / 5) * 5;
            int nextMultipleOf5 = lastMultipleOf5 + 5;
            if (note >= nextMultipleOf5 - 3) noten[i] = nextMultipleOf5;
        }
        return noten;
    }
}
