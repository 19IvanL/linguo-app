package ams2.linguo.interfaces;

import ams2.linguo.model.Lesson;

import java.util.List;

public interface ILessonQueries {
	List<Lesson> getLessonsByCourseId(long courseId);
}
