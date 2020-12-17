package ams2.linguo.model;

import java.io.Serializable;

public class Credentials implements Serializable {

	private static final long serialVersionUID = -8330711841587048425L;

    private User user;

	private String email;

	private String password;

	public Credentials() {}

	public Credentials(String email, String password, User user) {
		this.email = email;
		this.password = password;
		this.user = user;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
