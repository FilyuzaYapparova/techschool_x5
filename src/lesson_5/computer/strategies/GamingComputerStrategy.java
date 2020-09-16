package lesson_5.computer.strategies;

import lesson_5.computer.factories.monitor.AocMonitorFactory;
import lesson_5.computer.factories.processor.AmdProcessorFactory;
import lesson_5.computer.factories.ram.DynamicRamFactory;
import lesson_5.computer.factories.storage.SsdStorageFactory;
import lesson_5.computer.factories.videocard.NvidiaVideoCardFactory;

public class GamingComputerStrategy extends ComputerStrategy {

    public GamingComputerStrategy(AmdProcessorFactory processorFactory,
                                  AocMonitorFactory monitorFactory,
                                  NvidiaVideoCardFactory videoCardFactory,
                                  DynamicRamFactory ramFactory,
                                  SsdStorageFactory storageFactory) {
        super(processorFactory, monitorFactory, videoCardFactory, ramFactory, storageFactory);
    }

}
