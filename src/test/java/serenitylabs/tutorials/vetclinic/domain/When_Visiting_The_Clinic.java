package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.*;
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
    @Test
    public void the_vet_should_know_when_a_pet_vaccination_is_due(){

        NeedsVaccinations felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");
        LocalDate today = LocalDate.now();
        LocalDate nextYear = today.plusYears(1);
        felix.wasVaccinatedOn(today);
        assertThat(felix.nextVaccinationOn(),is(equalTo(nextYear)));
    }
    @Test
    public void dogs_need_vaccinations_every_six_months(){
        NeedsVaccinations fido = Dog.called("Fido").ofBreed("Labrador")
                .andOfColour("Black","White");
        LocalDate today = LocalDate.now();
        LocalDate nextVaccinationDate = today.plusMonths(6);
        fido.wasVaccinatedOn(today);
        assertThat(fido.nextVaccinationOn(),is(equalTo(nextVaccinationDate)));

    }
}
