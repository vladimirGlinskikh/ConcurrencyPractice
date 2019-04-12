package twoExample;

import oneExample.MockLoader;

public class Main {
    public static void main(String[] args) {
        final long before = System.currentTimeMillis();
        final Thread loader = new TextLoaderThread(new MockLoader("thread1"));
        loader.start();
        final long after = System.currentTimeMillis();
        System.out.printf("time delta: %d\n", (after - before) / 1_000);
    }
}
