package com.xuzp.fizzbuzz.rules;

import com.xuzp.fizzbuzz.common.Constant.Response;
import com.xuzp.fizzbuzz.common.Priority;

public class MultipleHundredFiveRule implements Rule {

    private static final int HUNDRED_FIVE = 105;

    @Override
    public int getPriority() {
        return Priority.THREE.getValue();
    }

    @Override
    public boolean trigger(int sequence) {
        return sequence > 0 && sequence % HUNDRED_FIVE == 0;
    }

    @Override
    public String echo(int sequence) {
        return Response.FIZZBUZZWHIZZ;
    }
}
