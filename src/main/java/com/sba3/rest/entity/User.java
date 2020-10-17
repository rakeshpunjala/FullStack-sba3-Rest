package com.sba3.rest.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CollectionId;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.lang.NonNull;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@NotNull(message="User Id is Required")
	@Min(value=1, message="User Id cannot be zero or negative")
	private Integer userId;
	
	@Column(name="firstName")
	@NotNull(message="Full Name is required")
	@NotBlank(message = "FullName is required")
	@Size(min=5,max=25,message="Full Name required to be 5 to 25 chars in length")
	private String fullName;
	
	@Column(name="lastName")
	@NotNull(message="Last Name is required")
	@NotBlank(message = "LastName is required")
	@Size(min=5,max=25,message="Last Name required to be 5 to 25 chars in length")
	private String lastName;
	
	@Column(name="email")
	@NotNull(message="email is required")
	@NotBlank(message = "email is required")
	@Size(min=5,max=25,message="email required to be 5 to 25 chars in length")
	private String email;
	

	@Column(name="mobile")
	@NotNull(message="Mobile Number is required")
	@NotBlank(message = "Mobile Number is required")
	@Pattern(regexp = "[1-9][0-9]{9}",message="mobile number should be ten digits only")
	private String mobile;
	
	
	
}
