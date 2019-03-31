package com.letsstartcoding.springbootrestapi.model;

import java.io.Serializable;

public class CompositeKey implements Serializable{
	private long ParentId;
	private long ChildId;
	private long AllowedId;
}
