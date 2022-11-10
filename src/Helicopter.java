public class Helicopter implements Flyable {
    protected String name;

    Helicopter(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("ヘリコプタ"+name+"ブーンと飛んでいる");
    }


}
