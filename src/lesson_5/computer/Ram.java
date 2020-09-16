package lesson_5.computer;

//Оперативная память
public class Ram {
    String manufacturer;
    double memorySize;
    double frequency;
    String memoryType;

    public Ram(String manufacturer, double memorySize, double frequency, String memoryType) {
        this.manufacturer = manufacturer;
        this.memorySize = memorySize;
        this.frequency = frequency;
        this.memoryType = memoryType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "manufacturer='" + manufacturer + '\'' +
                ", memorySize=" + memorySize +
                ", frequency=" + frequency +
                ", memoryType='" + memoryType + '\'' +
                '}';
    }
}
