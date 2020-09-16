package lesson_5.computer.factories.videocard;

import lesson_5.computer.VideoCard;

public class AmdVideoCardFactory implements VideoCardFactory {
    @Override
    public VideoCard getVideoCard() {
        return new VideoCard("AMD", "DDR5", 4, "Passive");
    }
}
