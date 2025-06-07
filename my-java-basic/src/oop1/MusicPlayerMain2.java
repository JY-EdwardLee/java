package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.volume = 0;
        data.isOn = false;


        data.isOn = true;
        System.out.println("시작");


        data.volume++;
        System.out.println(data.volume);
        data.volume++;
        System.out.println(data.volume);
        data.volume++;
        System.out.println(data.volume);
        data.volume++;
        System.out.println(data.volume);
        if (data.isOn) {
            System.out.println(data.volume);
        } else {
            System.out.println("음플 oFF");
        }
    }
}
