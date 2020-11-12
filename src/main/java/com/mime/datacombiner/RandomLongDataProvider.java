package com.mime.datacombiner;

import java.util.concurrent.ThreadLocalRandom;

public class RandomLongDataProvider implements DataProvider<Long> {

    @Override
    public Long getData() {
        return ThreadLocalRandom.current().nextLong();
    }
}
