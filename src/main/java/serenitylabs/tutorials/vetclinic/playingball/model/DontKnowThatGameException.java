package serenitylabs.tutorials.vetclinic.playingball.model;

public class DontKnowThatGameException extends RuntimeException {
    public DontKnowThatGameException(String message, Throwable e){
        super(message,e);
    }
    public DontKnowThatGameException(String message){
        super(message);
    }
    
}
