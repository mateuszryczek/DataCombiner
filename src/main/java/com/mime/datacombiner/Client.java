package com.mime.datacombiner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {

    private static final Logger LOGGER = LogManager.getLogger(Client.class);

    public static void main(String[] args) {
        DataCombiner<Long> combiner = new DataCombiner<>(new RandomLongDataProvider(), new RestLongDataProvider(), new PlusOperation());
        LOGGER.info(combiner.combine());
    }

}
