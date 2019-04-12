package twoExample;

import oneExample.ITextLoader;

public class TextLoaderRunnable implements Runnable {

    private final ITextLoader textLoader;

    public TextLoaderRunnable(ITextLoader textLoader) {
        this.textLoader = textLoader;
    }

    @Override
    public void run() {
        System.out.println(textLoader.loadText());
    }
}
