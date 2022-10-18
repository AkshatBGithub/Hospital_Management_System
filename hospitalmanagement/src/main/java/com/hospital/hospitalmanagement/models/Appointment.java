package com.hospital.hospitalmanagement.models;

import java.util.Date;

public class Appointment {
    private final int appt_id;
    private Date date;
    private int doctor_id;
    private int pat_id;

    public Appointment(int appt_id, Date date, int doctor_id, int pat_id) {
        this.appt_id = appt_id;
        this.date = date;
        this.doctor_id = doctor_id;
        this.pat_id = pat_id;
    }

    public int getAppt_id() {
        return appt_id;
    }

    public Date getDate() {
        return date;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public int getPat_id() {
        return pat_id;
    }
}
