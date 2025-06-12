package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        //Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance(); // 이겅 Object라 Hello 클래스로 다운캐스팅 해줘야함
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
