public class Losung4
{
    /**
     * Finds a keyboard and an usb withing the budget
     * @param keyboard_prices represented as array of int
     * @param usb_prices represented as array of int
     * @param budget represented as int
     * @return total price || -1 if a required pair can't be found
     */
    public static int solve(int [] keyboard_prices, int [] usb_prices, int budget)
    {
        for(int keyboard_price : keyboard_prices)
        {
            for (int usb_price : usb_prices)
            {
                int pair_price = keyboard_price + usb_price;
                if (pair_price <= budget)
                    return pair_price;
            }
        }
        return -1;
    }
}
