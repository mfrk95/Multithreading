package Demo2;

public class App {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Runner());
        Thread th2 = new Thread(new Runner());
        th1.start();
        th2.start();

    }
}
