public class Losung2_calculateAverageGrade
{
    /**
     * Calculate the average grade
     * @param grades is [] of grades
     * @return average grade
     */
    static int solve(int [] grades)
    {
        int average = 0;
        for (int note : grades)
        {
            average += note;
        }
        average = average / grades.length;
        return average;
    }
}
