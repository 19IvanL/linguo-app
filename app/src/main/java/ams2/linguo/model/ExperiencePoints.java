package ams2.linguo.model;

import java.io.Serializable;

public class ExperiencePoints implements Serializable {

	private static final long serialVersionUID = 8129984677512013507L;

    private User user;

	private int experience;

	public ExperiencePoints() {}

	public ExperiencePoints(User user, int experience) {
		this.user = user;
		this.experience = experience;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}
