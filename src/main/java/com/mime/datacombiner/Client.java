package com.mime.datacombiner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Client {

    private static final Logger LOGGER = Logger.getLogger(Client.class);

    public static void main(String[] args) {
        DataCombiner<Long> combiner = new DataCombiner<>(new RandomLongDataProvider(), new RestLongDataProvider(), new PlusOperation());
        BasicConfigurator.configure();
        LOGGER.info(combiner.combine());
    }

}
