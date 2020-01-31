package com.xuzp.fizzbuzz.rules;

import static com.xuzp.fizzbuzz.common.Response.FizzBuzzWhizz;

import com.xuzp.fizzbuzz.common.Priority;

public class MultipleHundredFiveRule implements Rule {

    private static final int HUNDRED_FIVE = 105;

    private Priority priority;

    public MultipleHundredFiveRule(Priority priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority.getValue();
    }

    @Override
    public boolean trigger(int sequence) {
        return sequence > 0 && sequence % HUNDRED_FIVE == 0;
    }

    @Override
    public String echo(int sequence) {
        return FizzBuzzWhizz.name();
    }
}
