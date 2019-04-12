package twoExample;

import oneExample.MockLoader;

public class Main {
    public static void main(String[] args) {
        final long before = System.currentTimeMillis();

        final Thread loader = new TextLoaderThread(new MockLoader("thread1"));
        loader.start();

        final Runnable runnableloader = new TextLoaderThread(new MockLoader("thread2"));
        runnableloader.run();

        final Thread thread = new Thread(runnableloader);
        thread.start();
        final Thread thread1 = new Thread(runnableloader);
        thread1.start();

        final long after = System.currentTimeMillis();
        System.out.printf("time delta: %d\n", (after - before) / 1_000);
    }
}
