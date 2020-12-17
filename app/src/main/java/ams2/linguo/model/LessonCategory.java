package ams2.linguo.model;

import java.io.Serializable;

public class LessonCategory implements Serializable {

	private long id;

	private String title;

	private Icon icon;

	public LessonCategory() {}
	
	public LessonCategory(String title) {
		this.title = title;
	}

	public LessonCategory(long id, String title) {
		this.id = id;
		this.title = title;
	}
	
	public LessonCategory(long id, String title, Icon icon) {
		this.id = id;
		this.title = title;
		this.icon = icon;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

}
