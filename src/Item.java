public class Item {
    private String name;
    private int price;

    // コンストラクタ
    Item(String name,int price) {
        this.name = name;
        this.price = price;
    }

    // コンストラクタ（空）
    Item() {
        this("未定(商品)",0);
    }

    // getNameメソッド
    public String getName(){
        return name;
    }

    // setNameメソッド
    public void setName(String name) {
        this.name = name;
    }
    // getPriceメソッド
    public int getPrice(){
        return price;
    }

    // setPriceメソッド
    public void setPrice(int price){
        this.price = price;
    }

    // printInfoメソッド
    public void printInfo() {
        System.out.println("商品名:"+name);
        System.out.println("価格:"+price);
    }
}
