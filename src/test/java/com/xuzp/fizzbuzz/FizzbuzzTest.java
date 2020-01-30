package com.xuzp.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzbuzzTest {

    @Test
    public void should_return_number_when_not_trigger_rule() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals("1", job.echo(1));
    }
}
