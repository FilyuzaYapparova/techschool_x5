package lesson_5.computer.factories.videocard;

import lesson_5.computer.VideoCard;

public class VideoCardFactory {
    public static VideoCard getVideoCard(String type) {
        switch (type) {
            case "AMD":
                return new VideoCard("AMD", "DDR5", 4, "Passive");
            case "NVIDIA":
                return new VideoCard("NVIDIA", "DDR6", 32, "Active");
        }
        System.out.println("Неизвестный тип видеокарты, берем новенький NVIDIA");
        return new VideoCard("NVIDIA", "DDR6", 32, "Active");
    }
}
