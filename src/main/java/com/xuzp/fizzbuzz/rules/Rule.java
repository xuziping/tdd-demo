package com.xuzp.fizzbuzz.rules;

import com.xuzp.fizzbuzz.common.Priority;

public interface Rule {

    int getPriority();

    boolean trigger(int sequence);

    String echo(int sequence);
}
