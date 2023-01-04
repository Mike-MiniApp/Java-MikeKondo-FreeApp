public abstract class Item {
   private String name;
   private int price;

   Item(String name,int price) {
       this.name = name;
       this.price = price;
   }

   Item() {
       this("未定",0);
   }

   void printInfo() {
       System.out.println(name);
       System.out.println(price);
   }
   abstract void printOptionInfo();
}

