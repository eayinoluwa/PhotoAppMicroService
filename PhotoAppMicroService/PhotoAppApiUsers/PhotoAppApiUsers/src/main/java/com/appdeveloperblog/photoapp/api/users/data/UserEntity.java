package com.appdeveloperblog.photoapp.api.users.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class UserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -870703038907889099L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=true, length = 50)
	private String firstname;
	
	@Column(nullable=true, length = 50)
	private String lastname;
	
	@Column(nullable=false, length = 120, unique=true)
	private String email;
	
	@Column(name="user_id",nullable=false)
	private String userId;
	
	@Column(name="encrypted_password", nullable=false)
	private String encryptedPassword;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

}
