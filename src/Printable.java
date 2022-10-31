public interface Printable {
    String message = "Printableインターフェース";

    void printInfo();

    default void printHello() {
        System.out.println("Hello from Printable");
    }
}
