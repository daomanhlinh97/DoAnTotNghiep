package com.letsstartcoding.springbootrestapiexample.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="cmsHistory")
@EntityListeners(AuditingEntityListener.class)
public class cmsHistory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	
	@NotBlank
	private long ParentId;
	
	private String ContentChange;
	
	@NotBlank
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date Date;
	
	@NotBlank
	private String User;
	
	@NotBlank
	private String Status;

	public cmsHistory(long id, long parentId, String contentChange, java.util.Date date, String user, String status) {
		super();
		Id = id;
		ParentId = parentId;
		ContentChange = contentChange;
		Date = date;
		User = user;
		Status = status;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public long getParentId() {
		return ParentId;
	}

	public void setParentId(long parentId) {
		ParentId = parentId;
	}

	public String getContentChange() {
		return ContentChange;
	}

	public void setContentChange(String contentChange) {
		ContentChange = contentChange;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
}
