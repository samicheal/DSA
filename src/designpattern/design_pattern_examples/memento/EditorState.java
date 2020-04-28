package designpattern.demos_from_code_with_mosh.memento;

public class EditorState {
  private final String content;

  public EditorState(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
