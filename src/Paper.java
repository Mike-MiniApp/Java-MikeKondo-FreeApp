public class Paper extends Item {
    private String size;
    private int number;

    Paper(String name, int price, String size, int number) {
        super(name,price);
        this.size = size;
        this.number = number;
    }

    @Override
    public void printInfo() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(size);
        System.out.println(number);
    }
}
