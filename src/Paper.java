public class Paper extends Item {
    private String size;
    private int number;

    Paper(String name, int price, String size, int number) {
        super(name,price);
        this.size = size;
        this.number = number;
    }

    Paper() {
        this("未定",0,"未定",0);
    }

    @Override
    void printOptionInfo() {
        System.out.println(size);
        System.out.println(number);
    }
}
