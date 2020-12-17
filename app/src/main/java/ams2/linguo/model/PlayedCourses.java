package ams2.linguo.model;

import java.io.Serializable;

public class PlayedCourses implements Serializable {

	private static final long serialVersionUID = 670216919931711193L;

    private User user;

    private Course course;

	private String status;

	public PlayedCourses() {}

	public PlayedCourses(User user, Course course, String status) {
		this.user = user;
		this.course = course;
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
