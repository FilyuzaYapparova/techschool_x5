package lesson_5.computer.factories.processor;

import lesson_5.computer.Processor;

public class IntelProcessorFactory implements ProcessorFactory {

    @Override
    public Processor getProcessor() {
        return new Processor(3.2, 4, 2,"I5","Intel");
    }
}
