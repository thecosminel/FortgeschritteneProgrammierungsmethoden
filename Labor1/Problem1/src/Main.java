import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] noten = {42, 37, 24, 68, 67, 65, 64, 77, 89, 91, 99};
        // Losung 1
        Losung1.testExpectedCase();
        Losung1.testUnexpectedCase();
        System.out.print("Problem 1.1: ");
        System.out.println(Arrays.toString(Losung1.solve(noten))); //  Expected: [37, 24]
        // Losung 2
        System.out.print("Problem 1.2: "); //  Expected: 65
        System.out.println(Losung2.solve(noten));
        // Losung 3
        System.out.print("Problem 1.3: ");
        System.out.println(Arrays.toString(Losung3.solve(noten))); //  Expected: [45, 37, 24, 70, 70, 65, 65, 80, 90, 91, 100]
        // Losung 4
        System.out.print("Problem 1.4: ");
        System.out.println(Losung4.solve(noten));  //  Expected: 100
    }
}