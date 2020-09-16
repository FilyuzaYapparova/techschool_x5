package lesson_5.computer.factories.monitor;

import lesson_5.computer.Monitor;

public class AserMonitorFactory implements MonitorFactory {

    @Override
    public Monitor getMonitor() {
        return new Monitor(23, "Aser", "4K");
    }
}
