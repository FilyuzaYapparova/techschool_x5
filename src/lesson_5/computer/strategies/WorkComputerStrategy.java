package lesson_5.computer.strategies;

import lesson_5.computer.factories.monitor.AserMonitorFactory;
import lesson_5.computer.factories.processor.IntelProcessorFactory;
import lesson_5.computer.factories.ram.StaticRamFactory;
import lesson_5.computer.factories.storage.HddStorageFactory;
import lesson_5.computer.factories.videocard.AmdVideoCardFactory;

public class WorkComputerStrategy extends ComputerStrategy {

    public WorkComputerStrategy(IntelProcessorFactory processorFactory,
                                AserMonitorFactory monitorFactory,
                                AmdVideoCardFactory videoCardFactory,
                                StaticRamFactory ramFactory,
                                HddStorageFactory storageFactory) {
        super(processorFactory, monitorFactory, videoCardFactory, ramFactory, storageFactory);
    }
}
