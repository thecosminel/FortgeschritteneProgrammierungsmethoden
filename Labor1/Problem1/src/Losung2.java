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
}
