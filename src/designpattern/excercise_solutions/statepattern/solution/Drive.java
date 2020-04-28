package designpattern.excercise_solutions.statepattern.solution;


public class Drive implements Travel<Object> {

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object getDirection() {
        return 1;
    }
}
