package oneExample;

public class MainWithThreads {
    public static void main(String[] args) throws InterruptedException {
        final ITextLoader fileTextLoader = new MockLoader("textFromFile");
        final ITextLoader webTextLoader = new MockLoader("textFromWeb");

        final long before = System.currentTimeMillis();

        final Thread fileTextLoadsThread = new Thread(()
                -> System.out.println(fileTextLoader.loadText()));
        fileTextLoadsThread.start();

        final Thread webTextLoaderThread = new Thread(()
                -> System.out.println(webTextLoader.loadText()));
        webTextLoaderThread.start();

        fileTextLoadsThread.join();
        webTextLoaderThread.join();

        final long after = System.currentTimeMillis();
        System.out.printf("time delta: %d\n", (after - before) / 1_000);
    }
}
