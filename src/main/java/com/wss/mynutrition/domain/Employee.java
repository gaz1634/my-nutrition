package com.wss.mynutrition.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	private @Id @GeneratedValue Long id;
	  private String firstName;
	  private String lastName;
	  private String title;
	  private String name;

}
