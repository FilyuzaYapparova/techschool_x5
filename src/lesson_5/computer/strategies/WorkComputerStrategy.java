package lesson_5.computer.strategies;

import lesson_5.computer.Computer;
import lesson_5.computer.factories.monitor.MonitorFactory;
import lesson_5.computer.factories.processor.ProcessorFactory;
import lesson_5.computer.factories.ram.RamFactory;
import lesson_5.computer.factories.storage.StorageFactory;
import lesson_5.computer.factories.videocard.VideoCardFactory;

public class WorkComputerStrategy extends ComputerStrategy {

    @Override
    public void buildComputer(Computer computer) {
        computer.setProcessor(ProcessorFactory.getProcessor("Intel"));
        computer.setMonitor(MonitorFactory.getMonitor("Aser"));
        computer.setRam(RamFactory.getRam("Static"));
        computer.setStorage(StorageFactory.getStorage("HDD"));
        computer.setVideoCard(VideoCardFactory.getVideoCard("AMD"));
    }
}
