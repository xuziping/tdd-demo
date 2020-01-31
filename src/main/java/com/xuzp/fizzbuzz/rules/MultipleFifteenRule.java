package com.xuzp.fizzbuzz.rules;

import static com.xuzp.fizzbuzz.common.Response.FizzBuzz;

import com.xuzp.fizzbuzz.common.Priority;

public class MultipleFifteenRule implements Rule {

    private static final int FIFTEEN = 15;

    private Priority priority;

    public MultipleFifteenRule(Priority priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority.getValue();
    }

    @Override
    public boolean trigger(int sequence) {
        return sequence > 0 && sequence % FIFTEEN == 0;
    }

    @Override
    public String echo(int sequence) {
        return FizzBuzz.name();
    }
}
