package com.xuzp.fizzbuzz.rules;

import static com.xuzp.fizzbuzz.common.Response.Whizz;

import com.xuzp.fizzbuzz.common.Priority;

public class MultipleSevenRule implements Rule {

    private static final int SEVEN = 7;

    private Priority priority;

    public MultipleSevenRule(Priority priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority.getValue();
    }

    @Override
    public boolean trigger(int sequence) {
        return sequence > 0 && sequence % SEVEN == 0;
    }

    @Override
    public String echo(int sequence) {
        return Whizz.name();
    }
}
