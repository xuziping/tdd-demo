package com.xuzp.fizzbuzz.rules;

import com.xuzp.fizzbuzz.common.Constant.Response;
import com.xuzp.fizzbuzz.common.Priority;

public class MultipleThreeRule implements Rule {

    private static final int THREE = 3;

    @Override
    public int getPriority() {
        return Priority.ONE.getValue();
    }

    @Override
    public boolean trigger(int sequence) {
        return sequence > 0 && sequence % THREE == 0;
    }

    @Override
    public String echo(int sequence) {
        return Response.FIZZ;
    }
}
