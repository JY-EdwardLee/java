package hello.spingmvc.basic;

import lombok.Data;

// 자동으로 getter setter 생성
@Data
public class HelloData {
    private String username;
    private int age;

}
