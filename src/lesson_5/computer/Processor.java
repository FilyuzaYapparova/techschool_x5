package lesson_5.computer;

//Процессор
public class Processor {
    private double frequency;
    private int coreCount;
    private int cashMemory;
    private String name;
    private String brand;

    public Processor(double frequency, int coreCount, int cashMemory, String name, String brand) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.cashMemory = cashMemory;
        this.name = name;
        this.brand = brand;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    public int getCashMemory() {
        return cashMemory;
    }

    public void setCashMemory(int cashMemory) {
        this.cashMemory = cashMemory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", coreCount=" + coreCount +
                ", cashMemory=" + cashMemory +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
