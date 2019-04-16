package treeExample;

public class SampleRunnable implements Runnable {
    public SampleRunnable() {
        super();
    }

    @Override
    public void run() {
        System.out.println("Hello, thread world!");
    }

    public static void main(String[] args) {
        Runnable r = new SampleRunnable();
        Thread tread = new Thread(r);
        tread.start();
    }
}
