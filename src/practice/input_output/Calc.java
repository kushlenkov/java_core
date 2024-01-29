package practice.input_output;

public class Calc {

    public long makeOperation(long number1, long number2, String operationType) {
        if (operationType.equals("+")) {
            return sum(number1, number2);
        }
        throw new UnsupportedOperationException("Данная операция не поддерживается");
    }

    private long sum(long number1, long number2) {
        return number1 + number2;
    }
}
