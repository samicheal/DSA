package designpattern.mementopattern;

public class FontNameState {

    private final String fontName;

    public FontNameState(String fontName) {
        this.fontName = fontName;
    }

    public String getContent() {
        return fontName;
    }
}
