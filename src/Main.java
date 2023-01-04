public class Main {
    public static void main(String[] args) {
       System.out.println("Printable.message:"+Printable.message);
       System.out.println("Myword.message:"+MyWord.message);

       MyWord myWord = new MyWord("失敗は成功の元");
       myWord.printInfo();
       myWord.printHello();
    }
}