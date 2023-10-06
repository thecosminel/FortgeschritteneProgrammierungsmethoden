public class Losung1
{
    /**
     * @param noten ist eine [] von Noten
     * @return [] mit nicht ausreichende Note
     */
    static int[] solve(int [] noten)
    {
        int [] nichtAusreichendeNoten = new int[noten.length];
        int index = 0;
        for (int note : noten)
        {
            // Check the "sufficient notice" condition
            if (note < 38)
            {
                nichtAusreichendeNoten[index] = note;
                index++;
            }
        }
        // Copy to a new array of the exact size as the solutions
        int [] nichtAusreichendeNotenToReturn = new int [index];
        System.arraycopy(nichtAusreichendeNoten, 0, nichtAusreichendeNotenToReturn, 0, index);
        return nichtAusreichendeNotenToReturn;
    }
}
