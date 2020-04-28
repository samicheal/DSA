package designpattern.excercise_solutions.mementopattern;

import java.util.List;

public class StateManager<T> {

    public static<T> void setState(List<T> list, T state){
        list.add(state);
    }

    public static<T> T restoreState(List<T> list){
        T restore = (T) new NullState("nothing to restore");

        if(list.isEmpty())
            return restore;

        int documentIndex = list.size() - 1;
        restore = list.get(documentIndex);
        list.remove(documentIndex);
        return restore;
    }
}
