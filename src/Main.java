import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println('a');
        System.out.println(3.14);
        System.out.println("abc");

        Paper paper1 = new Paper("コピー用紙A",500,"A4",300);
        Paper paper2 = new Paper("コピー用紙B",450,"B5",300);

        Ink ink1 = new Ink("インクBL01",1000,"黒");
        Ink ink2 = new Ink("インクBL02",1000,"青");

        System.out.println(paper1.toString());
        System.out.println(paper2.toString());
        System.out.println(ink1.toString());
        System.out.println(ink2.toString());
    }
}