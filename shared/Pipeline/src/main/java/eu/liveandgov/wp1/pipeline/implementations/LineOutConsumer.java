package eu.liveandgov.wp1.pipeline.implementations;

import eu.liveandgov.wp1.pipeline.Consumer;

import java.io.PrintStream;

/**
 * <p>The line-out consumer consumes objects and prints them with a print stream</p>
 * Created by Lukas Härtel on 10.02.14.
 */
public class LineOutConsumer implements Consumer<Object> {
    public final PrintStream printStream;

    public LineOutConsumer(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void push(Object o) {
        printStream.println(o);
    }
}
