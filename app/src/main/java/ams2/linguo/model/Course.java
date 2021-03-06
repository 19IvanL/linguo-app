package ams2.linguo.model;

import java.io.Serializable;

public class Course implements Serializable {

	private static final long serialVersionUID = 3680291961712473017L;

	private long id;

	private String baseLanguage;

	private String targetLanguage;

	public Course() {}

	public Course(String baseLanguage, String targetLanguage) {
		this.baseLanguage = baseLanguage;
		this.targetLanguage = targetLanguage;
	}

	public Course(long id, String baseLanguage, String targetLanguage) {
		this.id = id;
		this.baseLanguage = baseLanguage;
		this.targetLanguage = targetLanguage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBaseLanguage() {
		return baseLanguage;
	}

	public void setBaseLanguage(String baseLanguage) {
		this.baseLanguage = baseLanguage;
	}

	public String getTargetLanguage() {
		return targetLanguage;
	}

	public void setTargetLanguage(String targetLanguage) {
		this.targetLanguage = targetLanguage;
	}
	
}
