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
@Table(name="BlogItem")
@EntityListeners(AuditingEntityListener.class)
public class BlogItem {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long No;
	private long Id;
	private String Description;
	private String Keywords;
	private boolean IsHide;
	private String PageTitle;
	private String Categories;
	private String Excerpt;
	public BlogItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BlogItem(long no, long id, String description, String keywords, boolean isHide, String pageTitle,
			String categories, String excerpt) {
		super();
		No = no;
		Id = id;
		Description = description;
		Keywords = keywords;
		IsHide = isHide;
		PageTitle = pageTitle;
		Categories = categories;
		Excerpt = excerpt;
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
	public String getCategories() {
		return Categories;
	}
	public void setCategories(String categories) {
		Categories = categories;
	}
	public String getExcerpt() {
		return Excerpt;
	}
	public void setExcerpt(String excerpt) {
		Excerpt = excerpt;
	}
	
}
