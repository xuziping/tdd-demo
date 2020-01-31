package com.xuzp.fizzbuzz;

import static com.xuzp.fizzbuzz.common.Response.Buzz;
import static com.xuzp.fizzbuzz.common.Response.BuzzWhizz;
import static com.xuzp.fizzbuzz.common.Response.Fizz;
import static com.xuzp.fizzbuzz.common.Response.FizzBuzz;
import static com.xuzp.fizzbuzz.common.Response.FizzBuzzWhizz;
import static com.xuzp.fizzbuzz.common.Response.Whizz;

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
        Assert.assertEquals(Fizz.name(), job.echo(3));
        Assert.assertEquals(Fizz.name(), job.echo(6));
        Assert.assertEquals(Fizz.name(), job.echo(9));
    }

    @Test
    public void should_return_buzz_when_multiple_5() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(Buzz.name(), job.echo(5));
        Assert.assertEquals(Buzz.name(), job.echo(10));
        Assert.assertEquals(Buzz.name(), job.echo(20));
    }

    @Test
    public void should_return_whizz_when_multiple_7() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(Whizz.name(), job.echo(7));
        Assert.assertEquals(Whizz.name(), job.echo(14));
        Assert.assertEquals(Whizz.name(), job.echo(28));
    }

    @Test
    public void should_return_FizzBuzz_when_multiple_15() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(FizzBuzz.name(), job.echo(60));
        Assert.assertEquals(FizzBuzz.name(), job.echo(150));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_multiple_15() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(FizzBuzzWhizz.name(), job.echo(105));
        Assert.assertEquals(FizzBuzzWhizz.name(), job.echo(210));
        Assert.assertEquals(FizzBuzzWhizz.name(), job.echo(420));
    }

    @Test
    public void should_return_when_contain_3() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(Fizz.name(), job.echo(13));
        Assert.assertEquals(Fizz.name(), job.echo(30));
    }

    @Test
    public void should_return_when_contain_5() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(Fizz.name(), job.echo(13));
        Assert.assertEquals(BuzzWhizz.name(), job.echo(35));
        Assert.assertEquals(BuzzWhizz.name(), job.echo(105));
    }

    @Test
    public void should_return_when_contain_7() {
        FizzBuzzMain job = new FizzBuzzMain();
        Assert.assertEquals(Fizz.name(), job.echo(75));
    }
}
