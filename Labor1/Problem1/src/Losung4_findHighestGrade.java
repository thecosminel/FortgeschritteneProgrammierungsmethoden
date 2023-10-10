public class Losung4_findHighestGrade
{
    /**
     * Calculate the highest grade (grades will also be rounded)
     * @param grades is [] of grades
     * @return highest grade
     */
    static int solve(int[] grades)
    {
        int maximalRoundedNote = 0;
        for (int grade : grades)
        {
            // Calculate the next multiple of 5
            int lastMultipleOf5 = (grade / 5) * 5;
            int nextMultipleOf5 = lastMultipleOf5 + 5;
            // If "round" condition is meet, round the grade
            if (grade >= 38 && grade + 3 >= nextMultipleOf5) grade = nextMultipleOf5;
            // If grade > maximalRoundedNote, update maximalRoundedNote
            if (grade > maximalRoundedNote) maximalRoundedNote = grade;
        }
        return maximalRoundedNote;
    }
}
