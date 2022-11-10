import java.sql.SQLSyntaxErrorException;

public class Paper extends Item {
    private String size;
    private int number;

    public Paper(String name,int price,String size,int number) {
        super(name,price);
        this.size = size;
        this.number = number;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("用紙サイズ:"+size);
        System.out.println("枚数:"+number+"枚");
    }

    @Override
    public String toString() {
        return "Paperクラス:"+name+":"+price+":"+size+":"+number;
    }

}