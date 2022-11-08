public class MyWord implements Printable {

    private String myWord;

    public MyWord(String myWord) {
        this.myWord = myWord;
    }

    @Override
    public void printInfo() {
        System.out.println("座右の銘:"+myWord);
    }
}
