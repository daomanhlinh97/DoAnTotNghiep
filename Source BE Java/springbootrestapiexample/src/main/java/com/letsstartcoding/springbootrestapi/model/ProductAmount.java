package com.letsstartcoding.springbootrestapi.model;

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
@Table(name="ProductAmount")
@EntityListeners(AuditingEntityListener.class)
public class ProductAmount {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long No;
	private long Id;
	private String Name;
	private String Details;
	public ProductAmount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductAmount(long no, long id, String name, String details) {
		super();
		No = no;
		Id = id;
		Name = name;
		Details = details;
	}
	public long getNo() {
		return No;
	}
	public void setNo(long no) {
		No = no;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
	
	
}
