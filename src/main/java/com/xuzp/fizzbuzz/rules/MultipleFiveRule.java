package com.xuzp.fizzbuzz.rules;

import static com.xuzp.fizzbuzz.common.Response.Buzz;

import com.xuzp.fizzbuzz.common.Priority;

public class MultipleFiveRule implements Rule {

    private static final int FIVE = 5;
    private Priority priority;

    public MultipleFiveRule(Priority priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority.getValue();
    }

    @Override
    public boolean trigger(int sequence) {
        return sequence > 0 && sequence % FIVE == 0;
    }

    @Override
    public String echo(int sequence) {
        return Buzz.name();
    }
}
