package designpattern.excercise_solutions.statepattern.solution;

public class Walk implements Travel<Object> {

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object getDirection() {
        return 4;
    }
}
