package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

public class When_Visiting_The_Clinic {
    @Test
    public void cat_and_dogs_complain_to_the_assistant(){
        Dog fido = Dog.called("Fido").ofBreed("Labrador")
                .andOfColour("Black","White");
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");
  ComplaintRegister complaintRegister = new ComplaintRegister();
  VetAssistant assistant = new VetAssistant(complaintRegister);
  assistant.recordComplainFrom(fido);
  assistant.recordComplainFrom(felix);
    assertThat(complaintRegister.getComplaints(), hasItems("Grrrr","Meow"));
    }
}
