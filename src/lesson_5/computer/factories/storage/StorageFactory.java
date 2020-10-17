package lesson_5.computer.factories.storage;

import lesson_5.computer.Storage;

public class StorageFactory {
    public static Storage getStorage(String type) {
        switch (type) {
            case "HDD":
                return new Storage("Seagate", 1024, "HDD", "5.25 inch");
            case "SSD" :
                return new Storage("Samsung", 2048, "SDD", "10.25 inch");
        }
        System.out.println("Неизвестный тип памяти, берем самый классный - SSD");
        return new Storage("Samsung", 2048, "SDD", "10.25 inch");
    }
}
