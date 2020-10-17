package lesson_5.computer.factories.monitor;

import lesson_5.computer.Monitor;
import lesson_5.computer.Processor;

public class MonitorFactory {
    public static Monitor getMonitor(String type) {
        return new Monitor(23, type, "4K");
    }
}