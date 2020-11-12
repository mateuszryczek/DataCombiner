package com.mime.datacombiner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataCombinerTest {

    @Test
    public void combine_numbersByPlusOperation_notNull() {
        assertNotNull(new DataCombiner<>(new RandomLongDataProvider(), new RestLongDataProvider(), new PlusOperation()).combine());
    }

    @Test
    public void combine_stringsBySpaceOperation_textWithSpaceInBetween() {
        assertEquals("test test", new DataCombiner<>(new StringDataProvider(), new StringDataProvider(), new StringAddSpaceOperation()).combine());
    }


    static class StringDataProvider implements DataProvider<String> {

        @Override
        public String getData() {
            return "test";
        }
    }

    static class StringAddSpaceOperation implements Operation<String> {

        @Override
        public String apply(String x, String y) {
            return x + " " + y;
        }
    }

}