package homework.task6.exceptions;

public class DivisionByZeroException extends IllegalArgumentException {
    @Override
    public String toString() {
        return "Деление на ноль";
    }
}