public class UseItem {
    public static void main(String[] args) {
        Item paper = new Item("コピー用紙",300);
        paper.printInfo();
        Item ink = new Item("インク",300);
        ink.printInfo();
    }
}
