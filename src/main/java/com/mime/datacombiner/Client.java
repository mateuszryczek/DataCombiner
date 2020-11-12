package com.mime.datacombiner;

public class Client {

    public static void main(String[] args) {
        DataCombiner<Long> combiner = new DataCombiner<>(new RandomLongDataProvider(), new RestLongDataProvider(), new PlusOperation());
        System.out.println(combiner.combine());
    }

}
