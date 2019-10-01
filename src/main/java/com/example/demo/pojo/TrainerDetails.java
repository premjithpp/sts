package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="trainerdetails")
public class TrainerDetails {

	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="phone")
	private long phone;
	@Column(name="age")
	private int age;
	@Column(name="qualification")
	private String qualification;
	@Column(name="skills")
	private String skills ;
	@Column(name="linkdin")
	private String linkdin;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
}
