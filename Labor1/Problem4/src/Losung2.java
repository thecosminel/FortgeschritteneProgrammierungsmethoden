public class Losung2
{
    /**
     * Finds the most expensive keyboard
     * @param keyboard_prices represented as array of int
     * @return highest price
     */
    public static int solve(int [] keyboard_prices)
    {
        int highest_price = keyboard_prices[0];
        for(int price: keyboard_prices)
        {
            if (price > highest_price) highest_price = price;
        }
        return highest_price;
    }
}
