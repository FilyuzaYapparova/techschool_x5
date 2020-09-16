package lesson_5.computer.factories.storage;

import lesson_5.computer.Storage;

public class SsdStorageFactory implements StorageFactory {
    @Override
    public Storage getStorage() {
        return new Storage("Samsung", 2048, "SDD", "10.25 inch");
    }
}
