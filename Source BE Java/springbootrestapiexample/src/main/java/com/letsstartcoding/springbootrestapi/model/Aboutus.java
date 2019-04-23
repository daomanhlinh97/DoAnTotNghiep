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
@Table(name="Aboutus")
@EntityListeners(AuditingEntityListener.class)
public class Aboutus {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long No;
	private long Id;
	private String PageTitle;
	private String Description;
	private String Keywords;
	boolean IsHide;
	public Aboutus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aboutus(long no, long id, String page_Title, String description, String keywords, boolean is_Hide) {
		super();
		No = no;
		Id = id;
		PageTitle = page_Title;
		Description = description;
		Keywords = keywords;
		IsHide = is_Hide;
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
	public String getPageTitle() {
		return PageTitle;
	}
	public void setPageTitle(String page_Title) {
		PageTitle = page_Title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getKeywords() {
		return Keywords;
	}
	public void setKeywords(String keywords) {
		Keywords = keywords;
	}
	public boolean isIsHide() {
		return IsHide;
	}
	public void setIsHide(boolean is_Hide) {
		IsHide = is_Hide;
	}
	
	
	
}
