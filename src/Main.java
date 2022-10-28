public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Mikekondo");
        Member mikekondo = new Member();
        Member keinkondo = mikekondo;

        mikekondo.setId(100);
        System.out.println("mikekondoのid" + mikekondo.id);
        System.out.println(keinkondo.id);

        mikekondo.id = 200;

        System.out.println(keinkondo.id);
    }
}