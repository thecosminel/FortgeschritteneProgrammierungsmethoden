public class Losung3_roundAllGrades
{
    /**
     * Rounds all grades
     * if difference with next multiple of 5 < 3 is, round it
     * @param grades is [] of grade
     * @return [] of rounded grades
     */
    static int[] solve(int[] grades)
    {
        for (int i = 0; i < grades.length; i++)
        {
            int grade = grades[i];
            // Calculate the next multiple of 5
            int lastMultipleOf5 = (grade / 5) * 5;
            int nextMultipleOf5 = lastMultipleOf5 + 5;
            // If "round" condition is meet, round the grade
            if (grade >= 38 && grade + 3 >= nextMultipleOf5) grades[i] = nextMultipleOf5;
        }
        return grades;
    }
}
