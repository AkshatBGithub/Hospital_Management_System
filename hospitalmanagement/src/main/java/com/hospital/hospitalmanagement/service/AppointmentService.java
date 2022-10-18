package com.hospital.hospitalmanagement.service;

import com.hospital.hospitalmanagement.dao.AppointmentDao;
import com.hospital.hospitalmanagement.models.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    private final AppointmentDao appointmentDao;

    @Autowired
    public AppointmentService(@Qualifier("apptDao") AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }
    public void addAppointment(Appointment appointment){
        appointmentDao.addAppointment(appointment);
    }
}
