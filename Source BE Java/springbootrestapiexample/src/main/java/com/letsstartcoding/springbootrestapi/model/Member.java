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
@Table(name="Member")
@EntityListeners(AuditingEntityListener.class)
public class Member {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	private String Comments;
	private String FailedPassword;
	private boolean IsApproved;
	private boolean IsLocked;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date LastLockoutDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date LastLoginDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date LastPasswordchangeDate;
	private String MemberType;
	
	
	private String Login;
	private String Email;
	private String Password;
	private String MemberGroup;
	private String PasswordAnswer;
	private String PasswordQuestion;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(long id, String comments, String failedPassword, boolean isApproved, boolean isLocked,
			Date lastLockoutDate, Date lastLoginDate, Date lastPasswordchangeDate, String memberType, String login,
			String email, String password, String memberGroup, String passwordAnswer, String passwordQuestion) {
		super();
		Id = id;
		Comments = comments;
		FailedPassword = failedPassword;
		IsApproved = isApproved;
		IsLocked = isLocked;
		LastLockoutDate = lastLockoutDate;
		LastLoginDate = lastLoginDate;
		LastPasswordchangeDate = lastPasswordchangeDate;
		MemberType = memberType;
		Login = login;
		Email = email;
		Password = password;
		MemberGroup = memberGroup;
		PasswordAnswer = passwordAnswer;
		PasswordQuestion = passwordQuestion;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getFailedPassword() {
		return FailedPassword;
	}
	public void setFailedPassword(String failedPassword) {
		FailedPassword = failedPassword;
	}
	public boolean isIsApproved() {
		return IsApproved;
	}
	public void setIsApproved(boolean isApproved) {
		IsApproved = isApproved;
	}
	public boolean isIsLocked() {
		return IsLocked;
	}
	public void setIsLocked(boolean isLocked) {
		IsLocked = isLocked;
	}
	public Date getLastLockoutDate() {
		return LastLockoutDate;
	}
	public void setLastLockoutDate(Date lastLockoutDate) {
		LastLockoutDate = lastLockoutDate;
	}
	public Date getLastLoginDate() {
		return LastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		LastLoginDate = lastLoginDate;
	}
	public Date getLastPasswordchangeDate() {
		return LastPasswordchangeDate;
	}
	public void setLastPasswordchangeDate(Date lastPasswordchangeDate) {
		LastPasswordchangeDate = lastPasswordchangeDate;
	}
	public String getMemberType() {
		return MemberType;
	}
	public void setMemberType(String memberType) {
		MemberType = memberType;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMemberGroup() {
		return MemberGroup;
	}
	public void setMemberGroup(String memberGroup) {
		MemberGroup = memberGroup;
	}
	public String getPasswordAnswer() {
		return PasswordAnswer;
	}
	public void setPasswordAnswer(String passwordAnswer) {
		PasswordAnswer = passwordAnswer;
	}
	public String getPasswordQuestion() {
		return PasswordQuestion;
	}
	public void setPasswordQuestion(String passwordQuestion) {
		PasswordQuestion = passwordQuestion;
	}
	
	
}
