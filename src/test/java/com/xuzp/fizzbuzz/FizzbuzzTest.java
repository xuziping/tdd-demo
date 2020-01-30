package com.xuzp.fizzbuzz;

import static com.xuzp.fizzbuzz.common.Constant.Response.BUZZ;
import static com.xuzp.fizzbuzz.common.Constant.Response.FIZZ;
import static com.xuzp.fizzbuzz.common.Constant.Response.FIZZBUZZ;
import static com.xuzp.fizzbuzz.common.Constant.Response.FIZZBUZZWHIZZ;
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

    @Test
    public void should_return_FizzBuzz_when_multiple_15() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(FIZZBUZZ, job.echo(15));
        Assert.assertEquals(FIZZBUZZ, job.echo(45));
        Assert.assertEquals(FIZZBUZZ, job.echo(150));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_multiple_15() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(FIZZBUZZWHIZZ, job.echo(105));
        Assert.assertEquals(FIZZBUZZWHIZZ, job.echo(210));
        Assert.assertEquals(FIZZBUZZWHIZZ, job.echo(420));
    }

    @Test
    public void should_return_Fizz_when_contain_3() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(FIZZ, job.echo(13));
        Assert.assertEquals(FIZZ, job.echo(30));
        Assert.assertEquals(FIZZ, job.echo(315));
    }
}
