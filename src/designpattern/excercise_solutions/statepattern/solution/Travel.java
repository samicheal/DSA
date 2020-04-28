package designpattern.excercise_solutions.statepattern.solution;

public interface Travel<T extends Object> {
     T getEta();
     T getDirection();
}
