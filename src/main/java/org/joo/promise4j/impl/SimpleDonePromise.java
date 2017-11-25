package org.joo.promise4j.impl;

import org.joo.promise4j.DoneCallback;
import org.joo.promise4j.FailCallback;
import org.joo.promise4j.Promise;

public class SimpleDonePromise<D, F extends Throwable> extends AbstractPromise<D, F> {

    private D result;

    public SimpleDonePromise(final D result) {
        this.result = result;
    }

    @Override
    public Promise<D, F> done(final DoneCallback<D> callback) {
        callback.onDone(result);
        return this;
    }

    @Override
    public Promise<D, F> fail(final FailCallback<F> callback) {
        return this;
    }
}
