package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();


        on(data);
        VolumeDow(data);
        VolumeUp(data);
        off(data);
        }
    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("시작");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("시작");
    }
    static void VolumeUp(MusicPlayerData data){
        data.volume++;
    }
    static void VolumeDow(MusicPlayerData data){
        data.volume--;
    }
    static void showStatus(MusicPlayerData data){
        if (data.isOn) {
            System.out.println("11");
        } else {
            System.out.println(22);
        }
    }
}
