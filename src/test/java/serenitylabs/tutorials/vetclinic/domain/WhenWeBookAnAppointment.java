package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWeBookAnAppointment {

    private static final LocalDateTime TODAY_AT_2_PM = LocalDateTime.now().withHour(2).withMinute(0);
    private static final LocalDateTime THREE_DAYS_BEFORE_TODAY_AT_2_PM = LocalDateTime.now().minusDays(3).withHour(0).withMinute(0);
    private static final LocalDateTime THREE_DAYS_AFTER_TODAY_AT_2_PM = LocalDateTime.now().plusDays(3).withHour(0).withMinute(0);

    @Test
    public void an_appointment_has_a_patient_name_an_owner_and_a_date() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

        assertThat(appointment.getPetName(),equalTo("Fido"));
        assertThat(appointment.getOwner(),equalTo("Fred"));
        assertThat(appointment.getAppointmentTime(),equalTo(TODAY_AT_2_PM));


    }

    @Test
    public void an_appointment_can_have_an_optional_reason() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

        assertThat(appointment.getReason().isPresent(),equalTo(false));
        assertThat(appointment.getAppointmentTime(),equalTo(TODAY_AT_2_PM));


    }
    @Test
    public void an_appointment_can_have_an_comparing_appointments(){
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").isBefore(THREE_DAYS_BEFORE_TODAY_AT_2_PM).isAfter(THREE_DAYS_AFTER_TODAY_AT_2_PM).at(TODAY_AT_2_PM);


        assertThat(appointment.getBeforeAppointmentTime(),equalTo(THREE_DAYS_BEFORE_TODAY_AT_2_PM));
        assertThat(appointment.getAfterAppointmentTime(),equalTo(THREE_DAYS_AFTER_TODAY_AT_2_PM));

    }

}
