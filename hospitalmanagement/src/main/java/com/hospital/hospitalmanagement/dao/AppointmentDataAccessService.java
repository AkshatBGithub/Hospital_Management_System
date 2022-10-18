package com.hospital.hospitalmanagement.dao;

import com.hospital.hospitalmanagement.models.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("apptDao")
public class AppointmentDataAccessService implements AppointmentDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    RowMapper<Appointment> rowMapper = (rs, rowNum) ->{
        Appointment appointment = new Appointment(rs.getInt("appt_id"),
                                                    rs.getDate("appt_date"),
                                                    rs.getInt("doctor_id"),
                                                    rs.getInt("pat_id"));
        return  appointment;
    };

    @Override
    public void addAppointment(Appointment appointment) {
        String sql = "INSERT INTO appointments VALUES (?,?,?,?)";
        jdbcTemplate.update(sql,appointment.getAppt_id(),appointment.getDate(), appointment.getDoctor_id(),appointment.getPat_id());
    }

    @Override
    public List<Appointment> getAppointmentByPatId(int id) {
        return null;
    }
}

