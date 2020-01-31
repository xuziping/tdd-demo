package com.xuzp.fizzbuzz.rules;

import static com.xuzp.fizzbuzz.common.Response.Fizz;

import com.xuzp.fizzbuzz.common.Priority;

public class ContainThreeRule implements Rule {

    private static final String THREE = "3";

    private Priority priority;

    public ContainThreeRule(Priority priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority.getValue();
    }

    @Override
    public boolean trigger(int sequence) {
        return sequence > 0 && String.valueOf(sequence).contains(THREE);
    }

    @Override
    public String echo(int sequence) {
        return Fizz.name();
    }
}
