package com.mime.datacombiner;

/**
 * Any kind of operation.
 *
 * @param <E> the type of element on which the operation will be performed
 */
public interface Operation<E> {

   /**
    * Applies operation on given elements and returns the result of it.
    *
    * @param x first element
    * @param y second element
    * @return result of the operation on two given elements
    */
   E apply(E x, E y);

}
