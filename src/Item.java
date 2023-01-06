public abstract class Item implements Printable {
    protected String name;
    protected int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    Item() {
        this("未定",0);
    }
}

