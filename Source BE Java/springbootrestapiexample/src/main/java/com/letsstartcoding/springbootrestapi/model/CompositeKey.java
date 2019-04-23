package com.letsstartcoding.springbootrestapi.model;

import java.io.Serializable;

public class CompositeKey implements Serializable{
	private long ParentId;
	private long ChildId;
	private long AllowedId;
	public CompositeKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompositeKey(long parentId, long childId, long allowedId) {
		super();
		ParentId = parentId;
		ChildId = childId;
		AllowedId = allowedId;
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
	
	
}
