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
@Table(name="cmsContentType")
@EntityListeners(AuditingEntityListener.class)
public class cmsContentType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;

	private String Alias;

	private String Icon;

	private String Decription;

	@NotBlank
	private boolean IsContainer;

	public cmsContentType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public cmsContentType(long id, String alias, String icon, String decription, boolean isContainer) {
		super();
		Id = id;
		Alias = alias;
		Icon = icon;
		Decription = decription;
		IsContainer = isContainer;
	}



	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getAlias() {
		return Alias;
	}

	public void setAlias(String alias) {
		Alias = alias;
	}

	public String getIcon() {
		return Icon;
	}

	public void setIcon(String icon) {
		Icon = icon;
	}

	public String getDecription() {
		return Decription;
	}

	public void setDecription(String decription) {
		Decription = decription;
	}

	public boolean isIsContainer() {
		return IsContainer;
	}

	public void setIsContainer(boolean isContainer) {
		IsContainer = isContainer;
	}

}
