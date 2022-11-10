public interface Printable {
   String message = "Printableインタフェース";

   void printInfo();

   default void printHello(){
       System.out.println("Hello world");
   }
}
