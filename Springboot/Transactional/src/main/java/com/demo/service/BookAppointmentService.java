package com.demo.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.AppointmentFormDto;
import com.demo.entity.Appointments;
import com.demo.entity.Patients;
import com.demo.repository.AppointmentsRepository;
import com.demo.repository.PatientsRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class BookAppointmentService {
	
	@Autowired
	private PatientsRepository patientsRepository;
	@Autowired
	private AppointmentsRepository appointmentsRepository;
	
	public String bookAppointment(AppointmentFormDto appointmentFormDto) {
		Patients patients = new ObjectMapper().convertValue(appointmentFormDto, Patients.class);
		int patientno = patientsRepository.save(patients).getPatientno();
		System.out.println("Patient data saved successfully"+patientno);
		
//		int a = 2, b = 0, c;
//		c = a/b;
//		System.out.println(c);
		
		Appointments appointments = Appointments.builder()
				.date(new Date(System.currentTimeMillis()))
				.doctorno(125486)
				.patientno(patientno)
				.build();
		int appointmentno = appointmentsRepository.save(appointments).getAppointmentno();
		return "appointment data saved successfully"+appointmentno;
	}
}