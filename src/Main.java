import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
       System.out.println("main開始");
       try {
           file();
       }catch(FileNotFoundException ex) {
           System.out.println("例外発生:"+ex.getMessage());
       }
       System.out.println("main終了");
    }

    public static void file() throws FileNotFoundException {
        System.out.println("file");
        throw new FileNotFoundException("ファイルが見つかりません");
    }
}