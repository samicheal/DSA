package designpattern.statepattern.solution;

public class Cycle implements Travel<String> {
    private String response;

    @Override
    public String getEta() {
        System.out.println("Calculating ETA (cycling)");
        return response = "lara";
    }

    @Override
    public String getDirection() {
        return response;
    }
}
