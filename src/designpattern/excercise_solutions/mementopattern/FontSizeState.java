package designpattern.excercise_solutions.mementopattern;

public class FontSizeState {

    private final String fontSize;

    public FontSizeState(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getContent() {
        return fontSize;
    }
}
