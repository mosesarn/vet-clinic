package serenitylabs.tutorials.vetclinic.playingball.model;

public class PlayHockey implements Player {
    @Override
    public String play(){
        System.out.print("Hit the ball with the stick");
        return "Hit the ball with the stick";

    }
}
