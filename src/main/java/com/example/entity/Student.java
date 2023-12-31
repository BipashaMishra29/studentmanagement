package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Builder
@Entity
@Table(name = "mytable")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotBlank(message = "Invalid Name: Empty Name")
	@NotNull(message = "Invalid Name: Name can not be null")
	@Size(min = 3, max = 30, message = "Invalid Name: Must be of 3-30 characters")
	private String name;
	@NotBlank(message = "Invalid email: Empty Name")
	@NotNull(message = "Invalid email: Name can not be null")
	@Email(message = "Invalid email")
	private String email;

	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id,
			@NotBlank(message = "Invalid Name: Empty Name") @NotNull(message = "Invalid Name: Name can not be null") @Size(min = 3, max = 30, message = "Invalid Name: Must be of 3-30 characters") String name,
			@NotBlank(message = "Invalid email: Empty Name") @NotNull(message = "Invalid email: Name can not be null") @Email(message = "Invalid email") String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
