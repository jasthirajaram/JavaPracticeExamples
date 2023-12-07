package com.otp.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.otp.demo.encrypt.MaskData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {
	
	@Id
	@Column(name = "id")
    private String id;
	@Column(name = "name")
	private String name;
	@MaskData
	@Column(name = "phone", unique = true)
	private String phone;
	@Column(name = "password")
	@MaskData
	private String password;
}