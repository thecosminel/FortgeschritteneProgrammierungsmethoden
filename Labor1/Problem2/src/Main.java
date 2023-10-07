public class Main
{
    public static void main(String[] args)
    {
        int [] numbers = {1, 3, 6, 9, 2, 5};
        int result;
        // Losung 1
        result = Losung1.solve(numbers);
        System.out.print("Problem 2.1: ");
        System.out.println(result); // result = 9
        // Losung 2
        result = Losung2.solve(numbers);
        System.out.print("Problem 2.2: ");
        System.out.println(result); // result = 1
        // Losung 3
        result = Losung3.solve(numbers);
        System.out.print("Problem 2.3: ");
        System.out.println(result); // result = 25
    }
}