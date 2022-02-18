package com.task.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="detailer")
public class Detailer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="DetailerName")
	private String name;
	
	@Column(name="DetailerSalary")
	private double salary;
	
	@Column(name="DetailerShifts")
	private String shifts;
	
	@Column(name="active")
	private String active;

}
