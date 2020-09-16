package lesson_5.computer.factories.ram;

import lesson_5.computer.Ram;

public class DynamicRamFactory implements RamFactory {
    @Override
    public Ram getRam() {
        return new Ram("Intel Corporation", 16, 5, "Dynamic");
    }
}
