public class ItemFactory {
    public static Item createItem(String itemType, String name, double price) {
        if (itemType.equalsIgnoreCase("shirt")) {
            return new Shirt(name, price);
        } else if (itemType.equalsIgnoreCase("pants")) {
            return new Pants(name, price);
        } else {
            throw new IllegalArgumentException("Invalid item type");
        }
    }
}
