package designpattern.excercise_solutions.mementopattern;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<DocumentState> contentList = new ArrayList<>();
    private List<FontNameState> fontNameList = new ArrayList<>();
    private List<FontSizeState> fontSizeList = new ArrayList<>();

    public void pushDocumentState(DocumentState content){
        StateManager.setState(contentList, content);
    }

    public void pushFontNameState(FontNameState fontName){
        StateManager.setState(fontNameList, fontName);
    }

    public void pushFontSize(FontSizeState fontSize){
        StateManager.setState(fontSizeList, fontSize);
    }

    public DocumentState popDocumentState(){
        return StateManager.restoreState(contentList);
    }

    public FontNameState popFontNameState(){
        return StateManager.restoreState(fontNameList);
    }

    public FontSizeState popFontSizeState(){
        return StateManager.restoreState(fontSizeList);
    }
}
