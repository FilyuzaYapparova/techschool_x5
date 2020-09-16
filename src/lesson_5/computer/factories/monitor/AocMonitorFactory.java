package lesson_5.computer.factories.monitor;

import lesson_5.computer.Monitor;

public class AocMonitorFactory implements MonitorFactory {

    @Override
    public Monitor getMonitor() {
        return new Monitor(22, "Aoc", "2K");
    }
}
