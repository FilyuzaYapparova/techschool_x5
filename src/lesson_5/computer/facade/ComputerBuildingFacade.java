package lesson_5.computer.facade;

import lesson_5.computer.Computer;
import lesson_5.computer.ComputerType;
import lesson_5.computer.factories.monitor.AocMonitorFactory;
import lesson_5.computer.factories.monitor.AserMonitorFactory;
import lesson_5.computer.factories.processor.AmdProcessorFactory;
import lesson_5.computer.factories.processor.IntelProcessorFactory;
import lesson_5.computer.factories.ram.DynamicRamFactory;
import lesson_5.computer.factories.ram.StaticRamFactory;
import lesson_5.computer.factories.storage.HddStorageFactory;
import lesson_5.computer.factories.storage.SsdStorageFactory;
import lesson_5.computer.factories.videocard.AmdVideoCardFactory;
import lesson_5.computer.factories.videocard.NvidiaVideoCardFactory;
import lesson_5.computer.strategies.ComputerStrategy;
import lesson_5.computer.strategies.GamingComputerStrategy;
import lesson_5.computer.strategies.WorkComputerStrategy;

public class ComputerBuildingFacade {
    public void build(Computer computer, ComputerType computerType) {
        ComputerStrategy strategy;
        switch (computerType) {
            case GAME:
                System.out.println("Собираем игровой компьютер...");
                strategy = new GamingComputerStrategy(new AmdProcessorFactory(),
                        new AocMonitorFactory(),
                        new NvidiaVideoCardFactory(),
                        new DynamicRamFactory(),
                        new SsdStorageFactory());
                break;
            case WORK:
                System.out.println("Собираем компьютер для работы...");
                strategy = new WorkComputerStrategy(new IntelProcessorFactory(),
                        new AserMonitorFactory(),
                        new AmdVideoCardFactory(),
                        new StaticRamFactory(),
                        new HddStorageFactory());
                break;
            default:
                System.out.println("Неизвестный тип компьютера, соберем обычный для работы");
                strategy = new WorkComputerStrategy(new IntelProcessorFactory(),
                        new AserMonitorFactory(),
                        new AmdVideoCardFactory(),
                        new StaticRamFactory(),
                        new HddStorageFactory());
                break;
        }
        strategy.buildComputer(computer);
    }
}
