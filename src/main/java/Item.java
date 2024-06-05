public class Item {
    private ItemType type;
    private String name;
    private int price;
    private int numOfItems;

    public Item(ItemType type, String name, int price, int numOfItems) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.numOfItems = numOfItems;
    }

    public ItemType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNumOfItems() {
        return numOfItems;
    }
}
