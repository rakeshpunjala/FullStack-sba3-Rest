package com.sba3.rest.entity;

import java.time.LocalDate;
import java.util.Date;

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
@Table(name="interview")
public class Interview {
	
	@Id
	@NotNull(message="Interview Id is Required")
	@Min(value=1, message="Interview Id cannot be zero or negative")
	private Integer inId;
	
	@Column(name="interviewerName")
	@NotNull(message="Interviewer Name is required")
	@NotBlank(message = "Interviewer name is required")
	@Size(min=5,max=25,message="Interviewer Name required to be 5 to 25 chars in length")
	private String interviewerName;
	
	@Column(name="interviewName")
	@NotNull(message="interviewName is required")
	@NotBlank(message = "interviewName is required")
	@Size(min=5,max=25,message="interviewName required to be 5 to 25 chars in length")
	private String interviewName;
	
	@Column(name="userskills")
	@NotNull(message=" userskills is required")
	@NotBlank(message = " userskills is required")
	@Size(min=5,max=25,message=" userskills required to be 5 to 25 chars in length")
	private String  userskills;
	
	@Column(name="time")
	@NotNull(message="time is required")
	@NotBlank(message = "time is required")
	private int  time;
	
	@Column(name="interviewdate")
	@NotNull(message="interviewdate is required")
	@NotBlank(message = "interviewdate is required")
	private Date interviewdate;
	
	@Column(name="interviewStatus")
	@NotNull(message="interviewStatus is required")
	@NotBlank(message = "interviewStatus is required")
	private String interviewStatus;
	
	@Column(name="remarks")
	@NotNull(message="remarks is required")
	@NotBlank(message = "remarks is required")
	private String remarks;
	

	
}
