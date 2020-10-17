package lesson_5.computer.strategies;

import lesson_5.computer.Computer;
import lesson_5.computer.factories.monitor.MonitorFactory;
import lesson_5.computer.factories.processor.ProcessorFactory;
import lesson_5.computer.factories.ram.RamFactory;
import lesson_5.computer.factories.storage.StorageFactory;
import lesson_5.computer.factories.videocard.VideoCardFactory;

public abstract class ComputerStrategy {
    public abstract void buildComputer(Computer computer);
}
