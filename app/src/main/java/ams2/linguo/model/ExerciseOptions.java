package ams2.linguo.model;

import java.io.Serializable;

public class ExerciseOptions implements Serializable {

	private static final long serialVersionUID = -4453135099308640596L;

    private Exercise exercise;

	private String word;

	private boolean correct;

	private int position;

	public ExerciseOptions() {}
	
	public ExerciseOptions(Exercise exercise, String word) {
		this.exercise = exercise;
		this.word = word;
	}

	public ExerciseOptions(Exercise exercise, String word, boolean correct) {
		this.exercise = exercise;
		this.word = word;
		this.correct = correct;
	}

	public ExerciseOptions(Exercise exercise, String word, boolean correct, int position) {
		this.exercise = exercise;
		this.word = word;
		this.correct = correct;
		this.position = position;
	}

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
