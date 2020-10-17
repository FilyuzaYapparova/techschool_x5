package lesson_5.computer.facade;

import lesson_5.computer.Computer;
import lesson_5.computer.ComputerType;
import lesson_5.computer.strategies.ComputerStrategy;
import lesson_5.computer.strategies.GamingComputerStrategy;
import lesson_5.computer.strategies.WorkComputerStrategy;

public class ComputerBuildingFacade {
    public void build(Computer computer, ComputerType computerType) {
        ComputerStrategy strategy;
        switch (computerType) {
            case GAME:
                System.out.println("Собираем игровой компьютер...");
                strategy = new GamingComputerStrategy();
                break;
            case WORK:
                System.out.println("Собираем компьютер для работы...");
                strategy = new WorkComputerStrategy();
                break;
            default:
                System.out.println("Неизвестный тип компьютера, соберем обычный для работы");
                strategy = new WorkComputerStrategy();
                break;
        }
        strategy.buildComputer(computer);
    }
}
