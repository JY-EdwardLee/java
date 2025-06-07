package access;

public class Speaker {
    private int volume; // private을 통해서 다른 데서 접근을 막음

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if (volume >= 100) {
            System.out.println("최대 음ㅇ략임");
        } else{
            volume += 10;
            System.out.println(volume);
        }
    }
    void volumeDown(){
        volume -= 10;
        System.out.println(volume);
    }
    void showVolume(){
        System.out.println("현재 " + volume);
    }
}
