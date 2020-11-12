package com.mime.datacombiner;

/**
 * Combines data from two sources.
 *
 * @param <E> type of elements to be combined
 */
public class DataCombiner<E> {

    private DataProvider<E> firstProvider;
    private DataProvider<E> secondProvider;
    private Operation<E> operation;

    public DataCombiner(DataProvider<E> firstProvider, DataProvider<E> secondProvider, Operation<E> operation) {
        this.firstProvider = firstProvider;
        this.secondProvider = secondProvider;
        this.operation = operation;
    }

    public E combine() {
       return operation.apply(firstProvider.getData(), secondProvider.getData());
    }

    public void setFirstProvider(DataProvider<E> firstProvider) {
        this.firstProvider = firstProvider;
    }

    public void setSecondProvider(DataProvider<E> secondProvider) {
        this.secondProvider = secondProvider;
    }

    public void setOperation(Operation<E> operation) {
        this.operation = operation;
    }
}
