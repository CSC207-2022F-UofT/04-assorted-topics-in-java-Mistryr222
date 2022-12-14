/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

class DrivableTrader extends Trader<DrivableTrader> {
    /**
     * Construct a DrivableTrader giving
     * them an inventory, wishlist, and money
     *
     * @param inventory Objects in the DrivableTrader's inventory
     * @param wishlist Objects in the DrivableTrader's wishlist
     * @param money the DrivableTrader's money
     */

    public DrivableTrader(List<DrivableTrader> inventory, List<DrivableTrader> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    public DrivableTrader(int i) {
        super(i);
    }

    public int getSellingPrice(Tradable item) {
        int price = super.getSellingPrice((DrivableTrader) item);

        if (!(price == Tradable.MISSING_PRICE)) {
            return item.getPrice() + ((Drivable)item).getMaxSpeed();
        }

        return price;
    }

}














