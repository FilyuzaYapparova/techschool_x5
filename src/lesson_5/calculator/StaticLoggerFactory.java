package lesson_5.calculator;

public class StaticLoggerFactory {
    public static Logger createLogger(String type) {
        switch (type) {
            case "file":
                return new FileLogger();
            case "db":
                return new DbLogger();
            case "console":
                return new ConsoleLogger();
        }
        System.out.println("Неизвестный тип логгера, вывод на консоль...");
        return new ConsoleLogger();
    }
}