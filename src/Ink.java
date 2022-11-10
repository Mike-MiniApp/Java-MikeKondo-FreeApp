public class Ink extends Item {
    private String color;

    public Ink(String name,int price,String color) {
        super(name,price);
        this.color = color;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("色:"+color);
    }

    @Override
    public String toString(){
        return "Inkクラス:"+name+":"+price+":"+color;
    }
}
