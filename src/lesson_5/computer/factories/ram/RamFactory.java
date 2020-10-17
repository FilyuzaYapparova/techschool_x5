package lesson_5.computer.factories.ram;

import lesson_5.computer.Ram;

public class RamFactory {
    public static Ram getRam(String type) {
        switch (type) {
            case "Dynamic":
                new Ram("Intel Corporation", 16, 5, "Dynamic");
            case "Static":
                return new Ram("Samsung Corporation", 12, 4, "Static");
        }
        System.out.println("Неиозвестный тип RAM, берем динамичный");
        return new Ram("Intel Corporation", 16, 5, "Dynamic");
    }
}
