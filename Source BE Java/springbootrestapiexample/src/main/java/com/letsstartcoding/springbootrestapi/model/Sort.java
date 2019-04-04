package com.letsstartcoding.springbootrestapi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
@IdClass(CompositeKey.class)
@Table(name="Sort")
@EntityListeners(AuditingEntityListener.class)
public class Sort{	
	@Id
	private long ParentId;
	@Id
	private long ChildId;
	@Id
	private long AllowedId;
	private int SortOrder;
	private String Content;
	private String Type;
	
	public Sort() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sort(long parentId, long childId, long allowedId, int sortOrder, String content, String type) {
		super();
		ParentId = parentId;
		ChildId = childId;
		AllowedId = allowedId;
		SortOrder = sortOrder;
		Content = content;
		Type = type;
	}
	public long getParentId() {
		return ParentId;
	}
	public void setParentId(long parentId) {
		ParentId = parentId;
	}
	public long getChildId() {
		return ChildId;
	}
	public void setChildId(long childId) {
		ChildId = childId;
	}
	public long getAllowedId() {
		return AllowedId;
	}
	public void setAllowedId(long allowedId) {
		AllowedId = allowedId;
	}
	public int getSortOrder() {
		return SortOrder;
	}
	public void setSortOrder(int sortOrder) {
		SortOrder = sortOrder;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}

	
}
