package com.mime.datacombiner;

/**
 * Provides data of given type from any source.
 *
 * @param <E> type of data that will be returned
 */
public interface DataProvider<E> {

    /**
     * Returns data of given type.
     *
     * @return data
     */
    E getData();

}
