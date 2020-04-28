package designpattern.mementopattern;

public class DocumentState {

    private final String content;

    public DocumentState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
