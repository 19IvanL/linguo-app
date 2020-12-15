package ams2.linguo.model;

import java.io.Serializable;

public class Exercise implements Serializable {

	private long id;

    private Lesson lesson;

	private ExerciseType exerciseType;

	private String sentence;

	public Exercise() {}

	public Exercise(Lesson lesson, ExerciseType exerciseType, String sentence) {
		this.lesson = lesson;
		this.exerciseType = exerciseType;
		this.sentence = sentence;
	}
	
	public Exercise(long id, Lesson lesson, ExerciseType exerciseType, String sentence) {
		this.id = id;
		this.lesson = lesson;
		this.exerciseType = exerciseType;
		this.sentence = sentence;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public ExerciseType getExerciseType() {
		return exerciseType;
	}

	public void setExerciseType(ExerciseType exerciseType) {
		this.exerciseType = exerciseType;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

}
