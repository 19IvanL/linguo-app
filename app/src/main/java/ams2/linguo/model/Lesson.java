package ams2.linguo.model;

import java.io.Serializable;

public class Lesson implements Serializable {

	private long id;

    private Course course;

	private LessonCategory lessonCategory;

	public Lesson() {}

	public Lesson(Course course, LessonCategory lessonCategory) {
		this.course = course;
		this.lessonCategory = lessonCategory;
	}

	public Lesson(long id, Course course, LessonCategory lessonCategory) {
		this.id = id;
		this.course = course;
		this.lessonCategory = lessonCategory;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public LessonCategory getLessonCategory() {
		return lessonCategory;
	}

	public void setLessonCategory(LessonCategory lessonCategory) {
		this.lessonCategory = lessonCategory;
	}

}
