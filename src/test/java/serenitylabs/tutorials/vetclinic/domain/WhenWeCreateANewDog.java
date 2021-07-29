package serenitylabs.tutorials.vetclinic.domain;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class WhenWeCreateANewDog {
    Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");

    @Test
    public void a_new_dog_should_have_a_name_and_a_breed_and_a_colour() throws Exception {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
        assertThat(fido.getName(),equalTo("Fido"));
        assertThat(fido.getBreed(),equalTo("Labrador"));
        assertThat(fido.getColour(),contains("Black"));
//        Assert.assertEquals("Fido",fido.getName());
//        Assert.assertEquals("Labrador", fido.getBreed());
//        Assert.assertEquals("[Black]", fido.getColour().toString());
    }
    @Test
    public void a_dog_should_be_printed_in_a_redable_form(){
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
        assertThat(fido.toString(),is(equalTo("Fido the [black] labrador")));
        assertThat(fido.toString(),startsWith("Fido"));
        assertThat(fido.toString(),endsWith("labrador"));
        assertThat(fido.toString(),containsString("black"));
        assertThat(fido.toString(),is(equalToIgnoringCase("Fido the [black] labrador")));

    }
    @Test
    public void a_dog_can_have_several_colors(){
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black","White");
        assertThat(fido.getColour(),contains("Black","White"));
        assertThat(fido.getColour(),hasItem("White"));
        assertThat(fido.getColour(),not(hasItem("Red")));

    }

}
