package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;


        isOn = true;
        System.out.println("시작");


        volume++;
        System.out.println(volume);
        volume++;
        System.out.println(volume);
        volume++;
        System.out.println(volume);
        volume++;
        System.out.println(volume);
        if (isOn) {
            System.out.println(volume);
        } else {
            System.out.println("음플 oFF");
        }
    }
}
