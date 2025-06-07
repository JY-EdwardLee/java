package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void on(){
        isOn = true;
    }
    void off(){
        isOn = false;
    }
    void volumeUp(){
        volume++;
    }
    void volumeUp(int size){
        volume += size;
    }
    void volumeDown(){
        volume--;
    }
    void showStatuse(){
        if (isOn) {
            System.out.println("On and " + "volume: " + volume);
        } else {
            System.out.println("Off");
        }
    }
}
