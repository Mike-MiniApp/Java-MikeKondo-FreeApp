public class Timer {
    private int time = 10;

    // タイマーの時間を設定する
    void setTime(int time) {
        if (time > 0) {
            this.time = time;
            System.out.println("タイマーを設定しました:" + time+"秒");
            return;
        }
        System.out.println("設定エラー");
    }

    void start() {
        System.out.println("今から" + time + "秒測ります.スタート!");
    }
}
