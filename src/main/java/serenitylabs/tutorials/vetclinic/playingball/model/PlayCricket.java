package serenitylabs.tutorials.vetclinic.playingball.model;

public class PlayCricket implements Player {
    @Override
    public String play(){
        System.out.print("Hit the wicket");
        return "Hit the wicket";

    }
}
