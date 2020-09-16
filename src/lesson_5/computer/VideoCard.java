package lesson_5.computer;

//Видео-карта
public class VideoCard {
    String manufacturer;
    String memoryType;
    double memorySize;
    String cooling;

    public VideoCard(String manufacturer, String memoryType, double memorySize, String cooling) {
        this.manufacturer = manufacturer;
        this.memoryType = memoryType;
        this.memorySize = memorySize;
        this.cooling = cooling;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }

    public String getCooling() {
        return cooling;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "manufacturer='" + manufacturer + '\'' +
                ", memoryType='" + memoryType + '\'' +
                ", memorySize=" + memorySize +
                ", cooling='" + cooling + '\'' +
                '}';
    }
}
