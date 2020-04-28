package designpattern.excercise_solutions.statepattern.solution;

import designpattern.excercise_solutions.statepattern.DirectionService;

public class StateMain {

    public static void main(String [] args){
        DirectionService directionService = new DirectionService();
        directionService.setTravel(new Drive());
        directionService.getEta();
        System.out.println(directionService.getDirection());

        directionService.setTravel(new Walk());
        directionService.getEta();
        System.out.println(directionService.getDirection());
    }
}
