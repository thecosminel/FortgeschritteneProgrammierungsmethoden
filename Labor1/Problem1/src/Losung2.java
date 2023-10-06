public class Losung2
{
    /**
     * @param noten ist eine [] von Noten
     * @return Durchschnittswert der Noten
     */
    static int solve(int [] noten)
    {
        int average = 0;
        for (int note : noten)
        {
            average += note;
        }
        average = average / noten.length;
        return average;
    }
}
