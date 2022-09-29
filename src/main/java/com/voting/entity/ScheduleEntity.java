package com.voting.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ScheduleEntity {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull(message="electionName is mandatory")
	private String electionName;
	
	@NotNull(message="electionDate is mandatory")
	private String electionDate;

	public ScheduleEntity() {
		super();
	}

	@Override
	public String toString() {
		return "ScheduleEntity [id=" + id + ", electionName=" + electionName + ", electionDate=" + electionDate
				+ "]";
	}

	public ScheduleEntity(int userId, @NotNull(message = "electionName is mandatory") String electionName,
			@NotNull(message = "electionDate is mandatory") String electionDate) {
		super();
		this.id = id;
		this.electionName = electionName;
		this.electionDate = electionDate;
	}


	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getElectionName() {
		return electionName;
	}

	public void setElectionName(String electionName) {
		this.electionName = electionName;
	}

	public String getElectionDate() {
		return electionDate;
	}

	public void setElectionDate(String electionDate) {
		this.electionDate = electionDate;
	}

}
