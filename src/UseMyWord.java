public class UseMyWord {
    public static void main(String[] args) {
        System.out.println("Printable.message：" + Printable.message);
        System.out.println("MyWord.message：" + MyWord.message);

        MyWord myWord = new MyWord("近藤米功");

        myWord.printInfo();
        myWord.printHello();
    }
}
