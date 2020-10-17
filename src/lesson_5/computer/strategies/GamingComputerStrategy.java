package lesson_5.computer.strategies;

import lesson_5.computer.Computer;
import lesson_5.computer.factories.monitor.MonitorFactory;
import lesson_5.computer.factories.processor.ProcessorFactory;
import lesson_5.computer.factories.ram.RamFactory;
import lesson_5.computer.factories.storage.StorageFactory;
import lesson_5.computer.factories.videocard.VideoCardFactory;

public class GamingComputerStrategy extends ComputerStrategy {

    @Override
    public void buildComputer(Computer computer) {
        computer.setProcessor(ProcessorFactory.getProcessor("AMD"));
        computer.setMonitor(MonitorFactory.getMonitor("AOC"));
        computer.setRam(RamFactory.getRam("Dynamic"));
        computer.setStorage(StorageFactory.getStorage("SSD"));
        computer.setVideoCard(VideoCardFactory.getVideoCard("NVIDIA"));
    }
}
