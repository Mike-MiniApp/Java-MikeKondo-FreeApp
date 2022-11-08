public class Paper extends Item {
    private String size;
    private int number;

    public Paper(String name, int price, String size, int number) {
        setName(name);
        setPrice(price);
        this.size = size;
        this.number = number;
    }

    public void printSizeNumber() {
        System.out.println("用紙サイズ:" + size);
        System.out.println("枚数:" + number);
    }
    public void printInfo() {
        System.out.println("名前：" + getName());
        System.out.println("価格：" +getPrice());
        System.out.println("用紙サイズ:" + size);
        System.out.println("枚数:" + number);
    }
}