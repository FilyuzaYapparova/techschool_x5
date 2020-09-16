package lesson_5.computer.strategies;

import lesson_5.computer.Computer;
import lesson_5.computer.factories.monitor.MonitorFactory;
import lesson_5.computer.factories.processor.ProcessorFactory;
import lesson_5.computer.factories.ram.RamFactory;
import lesson_5.computer.factories.storage.StorageFactory;
import lesson_5.computer.factories.videocard.VideoCardFactory;

public abstract class ComputerStrategy {

    protected ProcessorFactory processorFactory;
    protected MonitorFactory monitorFactory;
    protected VideoCardFactory videoCardFactory;
    protected RamFactory ramFactory;
    protected StorageFactory storageFactory;

    public ComputerStrategy(ProcessorFactory processorFactory,
                            MonitorFactory monitorFactory,
                            VideoCardFactory videoCardFactory,
                            RamFactory ramFactory,
                            StorageFactory storageFactory) {
        this.processorFactory = processorFactory;
        this.monitorFactory = monitorFactory;
        this.videoCardFactory = videoCardFactory;
        this.ramFactory = ramFactory;
        this.storageFactory = storageFactory;
    }

    public void buildComputer(Computer computer) {
        computer.setProcessor(processorFactory.getProcessor());
        computer.setMonitor(monitorFactory.getMonitor());
        computer.setRam(ramFactory.getRam());
        computer.setStorage(storageFactory.getStorage());
        computer.setVideoCard(videoCardFactory.getVideoCard());
    }

}
