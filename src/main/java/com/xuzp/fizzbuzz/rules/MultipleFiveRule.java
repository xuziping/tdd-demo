package com.xuzp.fizzbuzz.rules;

import com.xuzp.fizzbuzz.common.Constant;
import com.xuzp.fizzbuzz.common.Priority;

public class MultipleFiveRule implements Rule {

    private static final int FIVE = 5;

    @Override
    public int getPriority() {
        return Priority.ONE.getValue();
    }

    @Override
    public boolean trigger(int sequence) {
        return sequence > 0 && sequence % FIVE == 0;
    }

    @Override
    public String echo(int sequence) {
        return Constant.Response.BUZZ;
    }
}
