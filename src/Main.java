public class Main {
    public static void main(String[] args) {
        Item banana = new Item("バナナ",200);
        banana.printInfo();

        Paper paper1 = new Paper("paper1",200,"A4",300);
        paper1.printInfo();

        Paper paper2 = new Paper();
        paper2.printInfo();
    }
}