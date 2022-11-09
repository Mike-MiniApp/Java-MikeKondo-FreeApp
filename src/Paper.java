public class Paper extends Item {
    private String size;
    private int number;

    Paper(){
        this("未定",0,"未定（コピー用紙)",0);
    }

    Paper(String name,int price,String size,int number){
        super(name,price);
        this.size = size;
        this.number = number;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("用紙サイズ:"+size);
        System.out.println("枚数:"+number);
    }
}