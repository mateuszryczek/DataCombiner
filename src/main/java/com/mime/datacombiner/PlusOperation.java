package com.mime.datacombiner;

public class PlusOperation implements Operation<Long> {

    @Override
    public Long apply(Long x, Long y) {
        return x + y;
    }
}
