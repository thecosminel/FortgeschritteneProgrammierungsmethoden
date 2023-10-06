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
}
