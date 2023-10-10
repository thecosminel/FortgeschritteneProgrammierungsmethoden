
public class Losung1_filterInsufficientGrades
{
    /**
     * Filters insufficient notes
     * insufficient: note < 38
     * @param grade is [] of notes
     * @return [] of insufficient grades
     */
    static int[] solve(int [] grade)
    {
        int [] insufficientGrades = new int[grade.length];
        int index = 0;
        for (int note : grade)
        {
            // Check the "sufficient notice" condition
            if (note < 38)
            {
                insufficientGrades[index] = note;
                index++;
            }
        }
        // Copy to a new array of the exact size as the solutions
        int [] insufficientGradesToReturn = new int [index];
        System.arraycopy(insufficientGrades, 0, insufficientGradesToReturn, 0, index);
        return insufficientGradesToReturn;
    }
}
