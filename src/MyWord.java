public class MyWord implements Printable {
    private String myWord;

    MyWord(String myWord) {
        this.myWord = myWord;
    }

    @Override
    public void printInfo() {
        System.out.println(myWord);
    }
}
