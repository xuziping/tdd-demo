package com.xuzp.fizzbuzz.rules;

import static com.xuzp.fizzbuzz.common.Constant.FIVE_STR;
import static com.xuzp.fizzbuzz.common.Constant.SEVEN_STR;
import static com.xuzp.fizzbuzz.common.Constant.THREE_STR;

import com.xuzp.fizzbuzz.common.Priority;
import java.util.ArrayList;
import java.util.List;

public class RuleFactory {

    private static final List<Rule> DEFAULT_RULES = new ArrayList() {
        {
            add(new MultipleThreeRule(Priority.ONE));
            add(new MultipleFiveRule(Priority.ONE));
            add(new MultipleSevenRule(Priority.ONE));
            add(new MultipleFifteenRule(Priority.TWO));
            add(new MultipleThirtyFiveRule(Priority.TWO));
            add(new MultipleHundredFiveRule(Priority.THREE));
        }
    };
    private static final List<Rule> CONTAIN_3_RULES = new ArrayList() {
        {
            add(new MultipleThreeRule(Priority.ONE));
            add(new MultipleFiveRule(Priority.ONE));
            add(new MultipleSevenRule(Priority.ONE));
            add(new MultipleFifteenRule(Priority.TWO));
            add(new MultipleThirtyFiveRule(Priority.TWO));
            add(new MultipleHundredFiveRule(Priority.THREE));
            add(new ContainThreeRule(Priority.FOUR));
        }
    };
    private static final List<Rule> CONTAIN_5_RULES = new ArrayList() {
        {
            add(new MultipleFiveRule(Priority.ONE));
            add(new MultipleSevenRule(Priority.ONE));
            add(new MultipleThirtyFiveRule(Priority.TWO));
        }
    };
    private static final List<Rule> CONTAIN_7_RULES = new ArrayList() {
        {
            add(new MultipleThreeRule(Priority.ONE));
            add(new MultipleSevenRule(Priority.ONE));
            add(new ContainThreeRule(Priority.TWO));
        }
    };

    public static List<Rule> getRules(int sequence) {
        String input = String.valueOf(sequence);
        if (input.contains(SEVEN_STR)) {
            return CONTAIN_7_RULES;
        }
        if (input.contains(FIVE_STR)) {
            return CONTAIN_5_RULES;
        }
        if (input.contains(THREE_STR)) {
            return CONTAIN_3_RULES;
        }
        return DEFAULT_RULES;
    }
}
