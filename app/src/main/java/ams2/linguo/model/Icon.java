package ams2.linguo.model;

import java.io.Serializable;

public class Icon implements Serializable {

	private long id;

	private String description;

	private String url;

	public Icon() {}

	public Icon(long id, String description, String url) {
		this.id = id;
		this.description = description;
		this.url = url;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
