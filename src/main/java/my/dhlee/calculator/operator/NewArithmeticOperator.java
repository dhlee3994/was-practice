package my.dhlee.calculator.operator;

import my.dhlee.calculator.PositiveNumber;

public interface NewArithmeticOperator {
    boolean support(final String operator);
    int calculate(final PositiveNumber operand1, final PositiveNumber operand2);
}
