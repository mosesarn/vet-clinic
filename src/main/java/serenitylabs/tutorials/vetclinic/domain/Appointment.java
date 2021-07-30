package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;
import java.util.Optional;

public class Appointment {
    private final String petName;
    private final String owner;
    private final LocalDateTime appointmentTime;
    private final Optional<String> reason;
    private final LocalDateTime beforeAppointmentTime;
    private final LocalDateTime afterAppointmentTime;

    public static AppointmentBooker forPetCalled(String petName) {
        return new AppointmentBooker(petName);

    }

    public Appointment(String petName, String owner, LocalDateTime appointmentTime,LocalDateTime beforeAppointmentTime, LocalDateTime afterAppointmentTime,String reason) {
        this.petName = petName;
        this.owner = owner;
        this.appointmentTime = appointmentTime;
        this.beforeAppointmentTime = beforeAppointmentTime;
        this.afterAppointmentTime = afterAppointmentTime;
        this.reason = Optional.ofNullable(reason);
    }

    public Appointment(String petName, String owner, LocalDateTime appointmentTime) {
        this(petName, owner, appointmentTime, null,null,null);
    }


    public String getPetName() {
        return petName;
    }

    public String getOwner() {
        return owner;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public Optional<String> getReason() {
        return reason;
    }

    public LocalDateTime getAfterAppointmentTime() {
        return afterAppointmentTime;
    }

    public LocalDateTime getBeforeAppointmentTime() {
        return beforeAppointmentTime;
    }

    public static class AppointmentBooker {
        private final String petName;
        private String owner;
        private String reason;
        private LocalDateTime beforeAppointmentTime;
        private LocalDateTime afterAppointmentTime;

        public AppointmentBooker(String petName) {
            this.petName = petName;
        }

        public AppointmentBooker ownedBy(String owner) {
            this.owner = owner;
            return this;
        }

        public Appointment at(LocalDateTime appointmentTime) {
            return new Appointment(petName, owner, appointmentTime, beforeAppointmentTime, afterAppointmentTime,reason);
        }

        public AppointmentBooker because(String reason) {
            this.reason = reason;
            return this;
        }
        public AppointmentBooker isBefore(LocalDateTime beforeAppointmentTime) {
            this.beforeAppointmentTime = beforeAppointmentTime;
            return this;
        }
        public AppointmentBooker isAfter(LocalDateTime afterAppointmentTime) {
            this.afterAppointmentTime = afterAppointmentTime;
            return this;
        }
    }
}
