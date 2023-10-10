public class Losung3
{
    /**
     * Finds the most expensive usb that can be bought with a budget
     * @param usb_prices represented as array of int
     * @param budget represented as int
     * @return highest price < budget
     */
    public static int solve(int [] usb_prices, int budget)
    {
        int highest_price = 0;
        for(int price: usb_prices)
        {
            if (price > highest_price && price <= budget) highest_price = price;
        }
        return highest_price;
    }
}
