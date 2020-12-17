package ams2.linguo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class User implements Serializable {

	private long id;

	private String name;

	private String username;

	private LocalDateTime registrationDate;

	public User() {}

	public User(String name, String username, LocalDateTime registrationDate) {
		this.name = name;
		this.username = username;
		this.registrationDate = registrationDate;
	}

	public User(long id, String name, String username, LocalDateTime registrationDate) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.registrationDate = registrationDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDateTime getregistrationDate() {
		return registrationDate;
	}

	public void setregistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}
	
}
