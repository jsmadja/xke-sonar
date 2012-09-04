package org.springframework.samples.petclinic.domain;

import org.springframework.samples.petclinic.Vet;

import java.util.*;

public class Planning {

    private Set<Appointment> appointments = new HashSet<Appointment>();

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void cancelAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }

    private List<Date> listAvailableHours() {
        return new ArrayList<Date>();
    }

    public List<Date> listAvailableHoursOf(Vet vet) {
        return new ArrayList<Date>();
    }

}
