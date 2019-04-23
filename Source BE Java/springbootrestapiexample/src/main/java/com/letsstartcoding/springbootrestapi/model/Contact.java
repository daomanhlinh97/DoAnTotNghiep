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
@Table(name="Contact")
@EntityListeners(AuditingEntityListener.class)
public class Contact {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long No;
	private long Id;
	private String Description;
	private String Keywords;
	private boolean IsHide;
	private String PageTitle;
	private String ContactFormHeader;
	private String ContactIntro;
	private String PickContactForm;
	private String MapHeader;
	private String MapCoordinates;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(long no, long id, String description, String keywords, boolean isHide, String pageTitle,
			String contactFormHeader, String contactIntro, String pickContactForm, String mapHeader,
			String mapCoordinates) {
		super();
		No = no;
		Id = id;
		Description = description;
		Keywords = keywords;
		IsHide = isHide;
		PageTitle = pageTitle;
		ContactFormHeader = contactFormHeader;
		ContactIntro = contactIntro;
		PickContactForm = pickContactForm;
		MapHeader = mapHeader;
		MapCoordinates = mapCoordinates;
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
	public void setIsHide(boolean isHide) {
		IsHide = isHide;
	}
	public String getPageTitle() {
		return PageTitle;
	}
	public void setPageTitle(String pageTitle) {
		PageTitle = pageTitle;
	}
	public String getContactFormHeader() {
		return ContactFormHeader;
	}
	public void setContactFormHeader(String contactFormHeader) {
		ContactFormHeader = contactFormHeader;
	}
	public String getContactIntro() {
		return ContactIntro;
	}
	public void setContactIntro(String contactIntro) {
		ContactIntro = contactIntro;
	}
	public String getPickContactForm() {
		return PickContactForm;
	}
	public void setPickContactForm(String pickContactForm) {
		PickContactForm = pickContactForm;
	}
	public String getMapHeader() {
		return MapHeader;
	}
	public void setMapHeader(String mapHeader) {
		MapHeader = mapHeader;
	}
	public String getMapCoordinates() {
		return MapCoordinates;
	}
	public void setMapCoordinates(String mapCoordinates) {
		MapCoordinates = mapCoordinates;
	}
	
	
}
