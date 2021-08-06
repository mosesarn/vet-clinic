package serenitylabs.tutorials.vetclinic.playingball.model;

public class Child {
    public void goPlay( Game game) throws Exception {
        Player gameToPlay = PlayerForGame.Called(game);
        gameToPlay.play();
    }

}
