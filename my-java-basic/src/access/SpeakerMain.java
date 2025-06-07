package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(10);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeDown();

        speaker.showVolume();
        // 필드 직접 접근
        System.out.println("필드 접근");
        // speaker.volume = 200;    // private 때문에 막힘
        speaker.showVolume();
    }
}
