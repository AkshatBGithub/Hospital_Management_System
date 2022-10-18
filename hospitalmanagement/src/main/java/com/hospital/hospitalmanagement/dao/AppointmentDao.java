package com.hospital.hospitalmanagement.dao;

import com.hospital.hospitalmanagement.models.Appointment;

import java.util.List;

public interface AppointmentDao {
    void addAppointment(Appointment appointment);
    List<Appointment> getAppointmentByPatId(int id);
}
