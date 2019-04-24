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
@Table(name="ProductItem")
@EntityListeners(AuditingEntityListener.class)
public class ProductItem {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long No;
	private long Id;
	private String Product_Name;
	private double Price;
	private String Category;
	private String Description;
	private String Sku;
	private String Photos;
	public ProductItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductItem(long no, long id, String product_Name, double price, String category, String description,
			String sku, String photos) {
		super();
		No = no;
		Id = id;
		Product_Name = product_Name;
		Price = price;
		Category = category;
		Description = description;
		Sku = sku;
		Photos = photos;
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
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getSku() {
		return Sku;
	}
	public void setSku(String sku) {
		Sku = sku;
	}
	public String getPhotos() {
		return Photos;
	}
	public void setPhotos(String photos) {
		Photos = photos;
	}
	
	
}
