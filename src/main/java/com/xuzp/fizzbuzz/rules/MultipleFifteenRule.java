package com.xuzp.fizzbuzz.rules;

import com.xuzp.fizzbuzz.common.Constant.Response;
import com.xuzp.fizzbuzz.common.Priority;

public class MultipleFifteenRule implements Rule {

    private static final int FIFTEEN = 15;

    @Override
    public int getPriority() {
        return Priority.TWO.getValue();
    }

    @Override
    public boolean trigger(int sequence) {
        return sequence > 0 && sequence % FIFTEEN == 0;
    }

    @Override
    public String echo(int sequence) {
        return Response.FIZZBUZZ;
    }
}
