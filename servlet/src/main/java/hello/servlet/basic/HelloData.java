package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

// json 형식 파싱
@Getter @Setter // useranme, age에 대해서 getter and setter 한 코드가 들어간 것이나 마찬가지임
public class HelloData {

    private String username;
    private int age;
}
