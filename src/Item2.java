public abstract class Item2 implements Printable {
    protected final String name; // サブクラスにアクセスできるようにするためprotectedにした
    protected final int price; // サブクラスにアクセスできるようにするためprotectedにした

    public Item2(String name,int price) {
        this.name = name;
        this.price = price;
    }
}
