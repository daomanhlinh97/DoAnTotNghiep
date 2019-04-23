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
@Table(name="HomeContent")
@EntityListeners(AuditingEntityListener.class)
public class HomeContent {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long No;
	private long Id;
	private String Header;
	private String Description;
	private String Caption;
	private String Address;
	private String Font;
	private String ColorTheme;
	private String SiteName;
	private String Logo;
	
	public HomeContent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HomeContent(long no, long id, String header, String description, String caption, String address, String font,
			String colorTheme, String siteName, String logo) {
		super();
		No = no;
		Id = id;
		Header = header;
		Description = description;
		Caption = caption;
		Address = address;
		Font = font;
		ColorTheme = colorTheme;
		SiteName = siteName;
		Logo = logo;
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

	public String getHeader() {
		return Header;
	}

	public void setHeader(String header) {
		Header = header;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getCaption() {
		return Caption;
	}

	public void setCaption(String caption) {
		Caption = caption;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getFont() {
		return Font;
	}

	public void setFont(String font) {
		Font = font;
	}

	public String getColorTheme() {
		return ColorTheme;
	}

	public void setColorTheme(String colorTheme) {
		ColorTheme = colorTheme;
	}

	public String getSiteName() {
		return SiteName;
	}

	public void setSiteName(String siteName) {
		SiteName = siteName;
	}

	public String getLogo() {
		return Logo;
	}

	public void setLogo(String logo) {
		Logo = logo;
	}
	
	

}
