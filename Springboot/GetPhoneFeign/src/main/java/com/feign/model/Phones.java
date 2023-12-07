package com.feign.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Phones {

	private int id;
	private String phoneName;
	private String processor;
	private int ram;
	private String phoneId;

}
