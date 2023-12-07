package com.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;


@Entity
@Builder
public class Appointments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentno;
	private int patientno;
	private Date date;
	private int doctorno;
	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointments(int appointmentno, int patientno, Date date, int doctorno) {
		super();
		this.appointmentno = appointmentno;
		this.patientno = patientno;
		this.date = date;
		this.doctorno = doctorno;
	}
	public int getAppointmentno() {
		return appointmentno;
	}
	public void setAppointmentno(int appointmentno) {
		this.appointmentno = appointmentno;
	}
	public int getPatientno() {
		return patientno;
	}
	public void setPatientno(int patientno) {
		this.patientno = patientno;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDoctorno() {
		return doctorno;
	}
	public void setDoctorno(int doctorno) {
		this.doctorno = doctorno;
	}
	@Override
	public String toString() {
		return "Appointments [appointmentno=" + appointmentno + ", patientno=" + patientno + ", date=" + date
				+ ", doctorno=" + doctorno + "]";
	}
}
