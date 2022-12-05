package my.dhlee.calculator;

public class PositiveNumber {
    private final int number;

    public PositiveNumber(int number) {
        validate(number);
        this.number = number;
    }

    public int toInt() {
        return this.number;
    }

    private static void validate(int number) {
        if (isNegativeNumber(number)) {
            throw new IllegalArgumentException("0 또는 음수를 계산할 수 없습니다.");
        }
    }

    private static boolean isNegativeNumber(int number) {
        return number <= 0;
    }
}
