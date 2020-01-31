package com.xuzp.fizzbuzz.rules;

import static com.xuzp.fizzbuzz.common.Response.Fizz;

import com.xuzp.fizzbuzz.common.Priority;

public class MultipleThreeRule implements Rule {

    private static final int THREE = 3;

    private Priority priority;

    public MultipleThreeRule(Priority priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority.getValue();
    }

    @Override
    public boolean trigger(int sequence) {
        return sequence > 0 && sequence % THREE == 0;
    }

    @Override
    public String echo(int sequence) {
        return Fizz.name();
    }
}
