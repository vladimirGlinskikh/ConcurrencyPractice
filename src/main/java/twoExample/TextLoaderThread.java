package twoExample;

import oneExample.ITextLoader;

public class TextLoaderThread extends Thread {

    private final ITextLoader textLoader;

    public TextLoaderThread(ITextLoader textLoader) {
        this.textLoader = textLoader;
    }

    @Override
    public void run() {
        System.out.println(textLoader.loadText());
    }
}
