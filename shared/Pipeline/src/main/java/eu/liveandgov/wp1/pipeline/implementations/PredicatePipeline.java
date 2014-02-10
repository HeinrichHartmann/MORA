package eu.liveandgov.wp1.pipeline.implementations;

import eu.liveandgov.wp1.pipeline.Pipeline;

/**
 * Created by Lukas Härtel on 10.02.14.
 */
public abstract class PredicatePipeline<Item> extends Pipeline<Item, Item> {
    protected abstract boolean filter(Item item);

    @Override
    public void push(Item o) {
        if (filter(o)) {
            produce(o);
        }
    }
}
