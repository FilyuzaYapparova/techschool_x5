package lesson_7.exceptions;

public class UnknownAccountException extends Exception {

    public UnknownAccountException(int accountId) {
        super("Аккаунт " + accountId + " не найден");
    }

}
