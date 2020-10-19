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
	
	@Column(name="userSkills")	
	@NotNull(message=" userskills is required")
	@NotBlank(message = " userskills is required")
	@Size(min=5,max=25,message=" userskills required to be 5 to 25 chars in length")
	private String  userSkills;
	
	@Column(name="time")
	private int  time;
	
	@Column(name="interviewdate")	
	@NotNull(message="interviewdate is required")
	@NotBlank(message = "interviewdate is required")
	private String interviewdate;
	
	@Column(name="interviewStatus")	
	@NotNull(message="interviewStatus is required")
	@NotBlank(message = "interviewStatus is required")
	private String interviewStatus;
	
	@Column(name="remarks")	
	@NotNull(message="remarks is required")
	@NotBlank(message = "remarks is required")
	private String remarks;
	
	public Integer getInId() {
		return inId;
	}

	public void setInId(Integer inId) {
		this.inId = inId;
	}

	public String getInterviewerName() {
		return interviewerName;
	}

	public void setInterviewerName(String interviewerName) {
		this.interviewerName = interviewerName;
	}

	public String getInterviewName() {
		return interviewName;
	}

	public void setInterviewName(String interviewName) {
		this.interviewName = interviewName;
	}

	public String getUserSkills() {
		return userSkills;
	}

	public void setUserSkills(String userSkills) {
		this.userSkills = userSkills;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getInterviewdate() {
		return interviewdate;
	}

	public void setInterviewdate(String interviewdate) {
		this.interviewdate = interviewdate;
	}

	public String getInterviewStatus() {
		return interviewStatus;
	}

	public void setInterviewStatus(String interviewStatus) {
		this.interviewStatus = interviewStatus;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
	

	
}
