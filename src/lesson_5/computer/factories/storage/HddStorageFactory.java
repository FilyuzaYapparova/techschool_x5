package lesson_5.computer.factories.storage;

import lesson_5.computer.Storage;

public class HddStorageFactory implements StorageFactory {
    @Override
    public Storage getStorage() {
        return new Storage("Seagate", 1024, "HDD", "5.25 inch");
    }
}
