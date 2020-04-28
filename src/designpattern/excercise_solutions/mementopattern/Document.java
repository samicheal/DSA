package designpattern.mementopattern;

public class Document {

    private String content;
    private String fontName;
    private String fontSize;

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }
}
