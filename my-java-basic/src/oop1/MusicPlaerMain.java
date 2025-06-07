package oop1;

public class MusicPlaerMain {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.on();

        musicPlayer.volumeUp();
        musicPlayer.volumeUp(3);
        musicPlayer.volumeUp();
        musicPlayer.volumeDown();

        musicPlayer.showStatuse();
        musicPlayer.off();
        musicPlayer.showStatuse();

    }
}
