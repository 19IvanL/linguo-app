package ams2.linguo.interfaces;

import ams2.linguo.model.Course;

import java.util.List;

public interface ICourseQueries {
	Course insertCourseByBaseAndTargetLanguages(String baseLanguage, String targetLanguage);
	List<Course> getCoursesByBaseAndTargetLanguages(String baseLanguage, String targetLanguage);
}
