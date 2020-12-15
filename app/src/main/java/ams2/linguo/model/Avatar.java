package ams2.linguo.model;

import java.io.Serializable;

public class Avatar implements Serializable {

	private static final long serialVersionUID = -837479134794109479L;

    private User user;

	private String url;

	public Avatar() {}

	public Avatar(User user, String url) {
		this.user = user;
		this.url = url;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
