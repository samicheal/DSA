package designpattern.statepattern;

import designpattern.statepattern.solution.Travel;

public class DirectionService {

    private Travel travel;

    public Object getEta() {
        return travel.getEta();
    }

    public Object getDirection() {
        return travel.getDirection();
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }
}
