package designpattern.excercise_solutions.mementopattern;

public class NullState {

    private final String message;

    public NullState(String message) {
        this.message = message;
    }

    public String getContent() {
        return message;
    }
}
