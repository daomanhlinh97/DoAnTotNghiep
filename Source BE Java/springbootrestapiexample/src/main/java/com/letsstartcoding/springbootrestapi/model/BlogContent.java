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
@Table(name="BlogContent")
@EntityListeners(AuditingEntityListener.class)
public class BlogContent {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long No;
	private long Id;
	private String Page_Title;
	private String Description;
	private String Keywords;
	private boolean IsHide;
	private int PostShow;
	private String DisqusShortname;
	public BlogContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BlogContent(long no, long id, String page_Title, String description, String keywords, boolean isHide,
			int postShow, String disqusShortname) {
		super();
		No = no;
		Id = id;
		Page_Title = page_Title;
		Description = description;
		Keywords = keywords;
		IsHide = isHide;
		PostShow = postShow;
		DisqusShortname = disqusShortname;
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
	public String getPage_Title() {
		return Page_Title;
	}
	public void setPage_Title(String page_Title) {
		Page_Title = page_Title;
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
	public int getPostShow() {
		return PostShow;
	}
	public void setPostShow(int postShow) {
		PostShow = postShow;
	}
	public String getDisqusShortname() {
		return DisqusShortname;
	}
	public void setDisqusShortname(String disqusShortname) {
		DisqusShortname = disqusShortname;
	}
	
	
}
