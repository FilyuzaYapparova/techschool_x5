package lesson_5.computer;

//Накопитель
public class Storage {
    String manufacturer;
    double memorySize;
    String driverType;
    String formFactor;

    public Storage(String manufacturer, double memorySize, String driverType, String formFactor) {
        this.manufacturer = manufacturer;
        this.memorySize = memorySize;
        this.driverType = driverType;
        this.formFactor = formFactor;
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

    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "manufacturer='" + manufacturer + '\'' +
                ", memorySize=" + memorySize +
                ", driverType='" + driverType + '\'' +
                ", formFactor='" + formFactor + '\'' +
                '}';
    }
}
