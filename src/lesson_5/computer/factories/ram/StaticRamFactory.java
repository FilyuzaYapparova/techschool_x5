package lesson_5.computer.factories.ram;

import lesson_5.computer.Ram;

public class StaticRamFactory implements RamFactory {
    @Override
    public Ram getRam() {
        return new Ram("Samsung Corporation", 12, 4, "Static");
    }
}
