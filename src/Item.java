public class Item {
    private String name;
    private int price;

    public Item(String name,int price) {
        this.name = name;
        this.price = price;
    }

    public Item(){}

    public String getName() {
        return name;
    }

    public int getPrice(){
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("商品名:"+name);
        System.out.println("価格:"+price+"円");
    }

}

