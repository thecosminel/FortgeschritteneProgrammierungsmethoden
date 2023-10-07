import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        // Losung 1
        int [] number1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int [] number2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int [] result = Losung1.solve(number1, number2);
        System.out.print("Problem 1.1: ");
        System.out.println(Arrays.toString(result));

    }
}