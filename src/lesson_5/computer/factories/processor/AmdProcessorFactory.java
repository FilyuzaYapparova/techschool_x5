package lesson_5.computer.factories.processor;

import lesson_5.computer.Processor;

public class AmdProcessorFactory implements ProcessorFactory {

    @Override
    public Processor getProcessor() {
        return new Processor(3.4, 8, 3,"7","AMD");
    }
}
