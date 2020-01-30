package com.xuzp.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzbuzzTest {

    @Test
    public void should_return_number_when_not_trigger_rule() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals("1", job.echo(1));
    }

    @Test
    public void should_return_fizz_when_multiple_3() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(Constant.FIZZ, job.echo(3));
        Assert.assertEquals(Constant.FIZZ, job.echo(6));
        Assert.assertEquals(Constant.FIZZ, job.echo(9));
    }

    @Test
    public void should_return_buzz_when_multiple_5() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(Constant.FIZZ, job.echo(5));
        Assert.assertEquals(Constant.FIZZ, job.echo(10));
        Assert.assertEquals(Constant.FIZZ, job.echo(15));
    }

    @Test
    public void should_return_whizz_when_multiple_7() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(Constant.FIZZ, job.echo(7));
        Assert.assertEquals(Constant.FIZZ, job.echo(14));
        Assert.assertEquals(Constant.FIZZ, job.echo(21));
    }
}
