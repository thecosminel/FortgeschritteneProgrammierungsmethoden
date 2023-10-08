public class Losung1
{
    /**
     * Finds the cheapest keyboard
     * @param keyboard_prices represented as array of int
     * @return lowest price
     */
    public static int solve(int [] keyboard_prices)
    {
        int cheapest_price = keyboard_prices[0];
        for(int price: keyboard_prices)
        {
            if (price < cheapest_price) cheapest_price = price;
        }
        return cheapest_price;
    }
}
