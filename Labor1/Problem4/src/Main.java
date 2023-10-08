public class Main
{
    public static void main(String[] args)
    {
        int [] keyboard_prices = {40, 35, 70, 15, 45};
        int result;
        // Losung 1
        result = Losung1.solve(keyboard_prices);
        System.out.print("Problem 4.1: ");
        System.out.println(result); // result = 15
        // Losung 2
        result = Losung2.solve(keyboard_prices);
        System.out.print("Problem 4.2: ");
        System.out.println(result); // result = 70
        // Losung 3
        int [] usb_prices = {15, 45, 20};
        int budget = 30;
        result = Losung3.solve(usb_prices, budget);
        System.out.print("Problem 4.3: ");
        System.out.println(result); // result = 20
        // Losung 4
        keyboard_prices = new int[] {40, 50, 60};
        usb_prices = new int[] {8, 12};
        budget = 60;
        result = Losung4.solve(keyboard_prices, usb_prices, budget);
        System.out.print("Problem 4.3: ");
        System.out.println(result); // result = 58
    }
}