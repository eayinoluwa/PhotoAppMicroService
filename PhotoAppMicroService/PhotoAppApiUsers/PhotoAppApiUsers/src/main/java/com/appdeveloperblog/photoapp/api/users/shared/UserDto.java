package com.appdeveloperblog.photoapp.api.users.shared;

import java.io.Serializable;
import java.util.List;

import com.appdeveloperblog.photoapp.api.users.model.AlbumResponseModel;

public class UserDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2508580537373107293L;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String userId;
	private String encryptedPassword;
	private List<AlbumResponseModel> albums;
	

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public List<AlbumResponseModel> getAlbums() {
		return albums;
	}

	public void setAlbums(List<AlbumResponseModel> albums) {
		this.albums = albums;
	}

}
