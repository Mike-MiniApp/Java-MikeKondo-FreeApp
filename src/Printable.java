public interface Printable {
    String message = "Printableインタフェース"; // 自動的にstatic finalになる
    void printInfo(); // 自動的にpublic abstractになる

    default void printHello() {
        System.out.println("Hello from Printable");
    }
}
