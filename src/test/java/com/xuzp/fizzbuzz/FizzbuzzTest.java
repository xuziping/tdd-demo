package com.xuzp.fizzbuzz;

import static com.xuzp.fizzbuzz.common.Constant.Response.BUZZ;
import static com.xuzp.fizzbuzz.common.Constant.Response.FIZZ;
import static com.xuzp.fizzbuzz.common.Constant.Response.WHIZZ;

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
        Assert.assertEquals(FIZZ, job.echo(3));
        Assert.assertEquals(FIZZ, job.echo(6));
        Assert.assertEquals(FIZZ, job.echo(9));
    }

    @Test
    public void should_return_buzz_when_multiple_5() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(BUZZ, job.echo(5));
        Assert.assertEquals(BUZZ, job.echo(10));
        Assert.assertEquals(BUZZ, job.echo(20));
    }

    @Test
    public void should_return_whizz_when_multiple_7() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(WHIZZ, job.echo(7));
        Assert.assertEquals(WHIZZ, job.echo(14));
        Assert.assertEquals(WHIZZ, job.echo(28));
    }
}
