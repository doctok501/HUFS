package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class test {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "t_id")
	
private int id;

@Column(name = "test1")
private String test;
}
