public class MyWord implements Printable {
     private String myWord;

     MyWord(String myWord) {
         this.myWord = myWord;
     }
     MyWord(){
         this("未定");
     }

     @Override
     public void printInfo() {
         System.out.println("座右の名:"+myWord);
     }
}
