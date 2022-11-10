public class Item {
   protected final String name;
   protected final int price;

   Item(String name,int price) {
       this.name = name;
       this.price = price;
   }

   public void printInfo() {
       System.out.println("商品名:"+name);
       System.out.println("価格:"+price);
   }
}

