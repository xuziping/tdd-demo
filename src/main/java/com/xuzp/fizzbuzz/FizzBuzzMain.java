package com.xuzp.fizzbuzz;

import com.xuzp.fizzbuzz.rules.ContainThreeRule;
import com.xuzp.fizzbuzz.rules.MultipleFifteenRule;
import com.xuzp.fizzbuzz.rules.MultipleFiveRule;
import com.xuzp.fizzbuzz.rules.MultipleHundredFiveRule;
import com.xuzp.fizzbuzz.rules.MultipleSevenRule;
import com.xuzp.fizzbuzz.rules.MultipleThreeRule;
import com.xuzp.fizzbuzz.rules.Rule;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FizzBuzzMain {

    private static final List<Rule> rules = new ArrayList();

    static {
        rules.add(new MultipleThreeRule());
        rules.add(new MultipleFiveRule());
        rules.add(new MultipleSevenRule());
        rules.add(new MultipleFifteenRule());
        rules.add(new MultipleHundredFiveRule());
        rules.add(new ContainThreeRule());
    }

    public static void main(String[] args) {

    }

    public String echo(Integer sequence) {
        return rules.stream()
            .sorted(Comparator.comparing(Rule::getPriority).reversed())
            .filter(rule -> rule.trigger(sequence)).findFirst()
            .map(rule -> rule.echo(sequence))
            .orElse(String.valueOf(sequence));
    }
}
