package lesson_5.calculator;

public class DbLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DbLogger();
    }
}
