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
@Table(name="User")
@EntityListeners(AuditingEntityListener.class)
public class User {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	private String Name;
	private String Email;
	private boolean IsAdmin;
	private boolean IsEditor;
	private boolean IsSensitive;
	private boolean IsTranslators;
	private boolean IsWriters;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long id, String name, String email, boolean isAdmin, boolean isEditor, boolean isSensitive,
			boolean isTranslators, boolean isWriters) {
		super();
		Id = id;
		Name = name;
		Email = email;
		IsAdmin = isAdmin;
		IsEditor = isEditor;
		IsSensitive = isSensitive;
		IsTranslators = isTranslators;
		IsWriters = isWriters;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public boolean isIsAdmin() {
		return IsAdmin;
	}
	public void setIsAdmin(boolean isAdmin) {
		IsAdmin = isAdmin;
	}
	public boolean isIsEditor() {
		return IsEditor;
	}
	public void setIsEditor(boolean isEditor) {
		IsEditor = isEditor;
	}
	public boolean isIsSensitive() {
		return IsSensitive;
	}
	public void setIsSensitive(boolean isSensitive) {
		IsSensitive = isSensitive;
	}
	public boolean isIsTranslators() {
		return IsTranslators;
	}
	public void setIsTranslators(boolean isTranslators) {
		IsTranslators = isTranslators;
	}
	public boolean isIsWriters() {
		return IsWriters;
	}
	public void setIsWriters(boolean isWriters) {
		IsWriters = isWriters;
	}
	
	
}
