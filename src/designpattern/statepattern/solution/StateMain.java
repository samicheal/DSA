package designpattern.statepattern.solution;

import designpattern.statepattern.DirectionService;

public class StateMain {

    public static void main(String [] args){
        DirectionService directionService = new DirectionService();

        System.out.println("=================== Driving ===================");
        directionService.setTravel(new Drive());
        directionService.getEta();
        System.out.println(directionService.getDirection());

        System.out.println("=================== Walking ===================");
        directionService.setTravel(new Cycle());
        directionService.getEta();
        System.out.println(directionService.getDirection());
    }
}
