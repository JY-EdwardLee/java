package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue; // 불변격체의 내부값이 바뀌면 안됨 result에 넣기
        return new ImmutableObj(result); // Immutable로 새로 생성한 객체로 return
    }

    public int getValue() {
        return value;
    }
}
