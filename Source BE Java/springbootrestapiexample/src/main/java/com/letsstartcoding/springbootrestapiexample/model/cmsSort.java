//package com.letsstartcoding.springbootrestapiexample.model;
//
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.EntityListeners;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Past;
//
//import org.hibernate.validator.constraints.NotBlank;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//import org.springframework.format.annotation.DateTimeFormat;
//
//@Entity
//@Table(name="cmsSort")
//@EntityListeners(AuditingEntityListener.class)
//
//public class cmsSort {
//	
//	@Id
//	private long ParentId;
//	
//	@Id
//	private long ChildId;
//	
//	@Id
//	private long AllowedId;
//
//	@NotBlank
//	private int Sort;
//	
//	@NotBlank
//	private String Content;
//
//	public cmsSort(long parentId, long childId, long allowedId, int sort, String content) {
//		super();
//		ParentId = parentId;
//		ChildId = childId;
//		AllowedId = allowedId;
//		Sort = sort;
//		Content = content;
//	}
//
//	public long getParentId() {
//		return ParentId;
//	}
//
//	public void setParentId(long parentId) {
//		ParentId = parentId;
//	}
//
//	public long getChildId() {
//		return ChildId;
//	}
//
//	public void setChildId(long childId) {
//		ChildId = childId;
//	}
//
//	public long getAllowedId() {
//		return AllowedId;
//	}
//
//	public void setAllowedId(long allowedId) {
//		AllowedId = allowedId;
//	}
//
//	public int getSort() {
//		return Sort;
//	}
//
//	public void setSort(int sort) {
//		Sort = sort;
//	}
//
//	public String getContent() {
//		return Content;
//	}
//
//	public void setContent(String content) {
//		Content = content;
//	}
//
//}
