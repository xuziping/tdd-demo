package com.xuzp.fizzbuzz.rules;

public interface Rule {

    int getPriority();

    boolean trigger(int sequence);

    String echo(int sequence);
}
