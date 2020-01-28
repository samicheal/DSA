package designpattern.statepattern.solution;

public class Transit implements Travel<Object> {

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (Transit)");
        return 2;
    }

    @Override
    public Object getDirection() {
        return 2;
    }
}
