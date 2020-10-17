package lesson_5.computer.factories.processor;

import lesson_5.computer.Processor;

public class ProcessorFactory {
    public static Processor getProcessor(String type) {
        switch (type) {
            case "Intel":
                return new Processor(3.2, 4, 2,"I5","Intel");
            case "AMD" :
                return new Processor(3.4, 8, 3,"7","AMD");
        }
        System.out.println("Неизвестный тип процессора, возьмем процессор типа Intel");
        return new Processor(3.2, 4, 2,"I5","Intel");
    }
}
