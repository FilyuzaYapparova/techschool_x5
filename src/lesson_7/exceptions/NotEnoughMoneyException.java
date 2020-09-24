package lesson_7.exceptions;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException() {
        super("Недостаточно средств");
    }
}
