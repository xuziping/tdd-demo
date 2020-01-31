package com.xuzp.fizzbuzz;

import com.xuzp.fizzbuzz.rules.Rule;
import com.xuzp.fizzbuzz.rules.RuleFactory;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzzMain {

    public static void main(String[] args) {
        FizzBuzzMain main = new FizzBuzzMain();
        IntStream.range(1, 16).forEach(seq ->
            System.out.println(main.echo(seq))
        );
    }

    public String echo(Integer sequence) {
        List<Rule> rules = RuleFactory.getRules(sequence);
        return rules.stream()
            .sorted(Comparator.comparing(Rule::getPriority).reversed())
            .filter(rule -> rule.trigger(sequence)).findFirst()
            .map(rule -> rule.echo(sequence))
            .orElse(String.valueOf(sequence));
    }
}
