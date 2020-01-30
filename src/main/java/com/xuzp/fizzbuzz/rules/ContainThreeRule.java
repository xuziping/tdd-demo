package com.xuzp.fizzbuzz.rules;

import com.xuzp.fizzbuzz.common.Constant.Response;
import com.xuzp.fizzbuzz.common.Priority;

public class ContainThreeRule implements Rule {

    private static final String THREE = "3";

    @Override
    public int getPriority() {
        return Priority.FOUR.getValue();
    }

    @Override
    public boolean trigger(int sequence) {
        return sequence > 0 && String.valueOf(sequence).contains(THREE);
    }

    @Override
    public String echo(int sequence) {
        return Response.FIZZ;
    }
}
