package cucumber;

public class Hello {
    private String greeting;

    public Hello(String greeting) {
        this.greeting = greeting;
    }

    public String sayHi() {
        return greeting + " World";
    }
}
