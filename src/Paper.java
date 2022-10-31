public class Paper extends Item {
    private String size;
    private int number;

    // Paperのコンストラクタ
    public Paper(String name,int price, String size, int number){
        setName(name);
        setPrice(price);
        this.size = size;
        this.number = number;
    }

    public Paper() {
        this("未定(コピー用紙",0,"未定",0);
    }

    @Override
    public void printInfo() {
        System.out.println("商品名:"+ getName());
        System.out.println("価格:"+ getPrice()+"円");
        System.out.println("サイズ:"+size);
        System.out.println("ナンバー:"+number+"枚");
    }
}
