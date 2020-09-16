package lesson_5.computer.factories.videocard;

import lesson_5.computer.VideoCard;

public class NvidiaVideoCardFactory implements VideoCardFactory {
    @Override
    public VideoCard getVideoCard() {
        return new VideoCard("NVIDIA", "DDR6", 32, "Active");
    }
}
