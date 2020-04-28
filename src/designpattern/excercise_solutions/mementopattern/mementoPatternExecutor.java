package designpattern.mementopattern;

public class mementoPatternExecutor {

    public static void main(String [] args){
        Document document = new Document();
        document.setContent("The day is bright");
        document.setFontName("Time New Roman");
        document.setFontSize("18px");

        History history = new History();
        history.pushDocumentState(new DocumentState(document.getContent()));
        history.pushFontNameState(new FontNameState(document.getFontName()));
        history.pushFontSize(new FontSizeState(document.getFontSize()));

        document.setContent("The day is bright and clouds are blue and beautiful.");
        history.pushDocumentState(new DocumentState(document.getContent()));

        document.setContent(history.popDocumentState().getContent());
        document.setContent(history.popDocumentState().getContent());

        document.setFontSize(history.popFontSizeState().getContent());

        System.out.println("==============Current State====================");
        System.out.println("Document Content :: " + document.getContent());
        System.out.println("Document Font Name :: " + document.getFontName());
        System.out.println("Document Font Size :: " + document.getFontSize());
    }
}
