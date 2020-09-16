package lesson_5.computer;

public class Computer {
    private Storage storage;
    private Processor processor;
    private Ram ram;
    private Monitor monitor;
    private VideoCard videoCard;


    public Computer() {

    }

    public Computer(Storage storage, Processor processor, Ram ram, Monitor monitor, VideoCard videoCard) {
        this.storage = storage;
        this.processor = processor;
        this.ram = ram;
        this.monitor = monitor;
        this.videoCard = videoCard;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "storage=" + storage +
                ", processor=" + processor +
                ", ram=" + ram +
                ", monitor=" + monitor +
                ", videoCard=" + videoCard +
                '}';
    }
}
