package com.xuzp.fizzbuzz.rules;

import static com.xuzp.fizzbuzz.common.Response.BuzzWhizz;

import com.xuzp.fizzbuzz.common.Priority;

public class MultipleThirtyFiveRule implements Rule {

    private static final int THIRTY_FIVE = 35;

    private Priority priority;

    public MultipleThirtyFiveRule(Priority priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority.getValue();
    }

    @Override
    public boolean trigger(int sequence) {
        return sequence > 0 && sequence % THIRTY_FIVE == 0;
    }

    @Override
    public String echo(int sequence) {
        return BuzzWhizz.name();
    }
}
