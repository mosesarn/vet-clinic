package serenitylabs.tutorials.vetclinic.playingball.model;

public class PlayerForGame {
    public static Player Called(Game game) {
        switch (game) {
            case Football:
                Player play = new PlayFootBall();

            case Cricket:
                return new PlayCricket();
            case Handball:
                return new PlayHandball();
            case Tennis:
                return new PlayTennis();
            case Hockey:
                return new PlayHockey();
            default:
                throw new DontKnowThatGameException("Game dont Know Exception");
        }
    }
}
