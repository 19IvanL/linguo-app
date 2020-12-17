package ams2.linguo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class League implements Serializable {

	private long id;

	private String title;

	private LocalDateTime startDate;

	private LocalDateTime endDate;

	public League() {}

	public League(String title, LocalDateTime startDate, LocalDateTime endDate) {
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public League(long id, String title, LocalDateTime startDate, LocalDateTime endDate) {
		this.id = id;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}

}
