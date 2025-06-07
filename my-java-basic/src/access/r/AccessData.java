package access.r;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println(publicField);

    }
    void defaultMethod() {
        System.out.println(defaultField);

    }
    private void privateMethod() {
        System.out.println(privateField);

    }
    public void innerAccess() {
        publicField = publicField + defaultField;
        defaultField = defaultField + privateField;
        privateField = privateField + publicField;
        publicMethod();
        defaultMethod();
        privateMethod();

    }
}
