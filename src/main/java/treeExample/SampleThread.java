package treeExample;

public class SampleThread extends Thread {
    public SampleThread() {
        super();
    }

    public void run() {
        System.out.println("Hello, threads world!");
    }

    public static void main(String[] args) {
        Thread tread = new SampleThread();
        tread.start();
    }
}
