package lesson_5.computer;

//Монитор
public class Monitor {
    double size;
    String brand;
    String resolution;

    public Monitor(double size, String brand, String resolution) {
        this.size = size;
        this.brand = brand;
        this.resolution = resolution;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
