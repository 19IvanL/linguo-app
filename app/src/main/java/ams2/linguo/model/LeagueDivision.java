package ams2.linguo.model;

import java.io.Serializable;

public class LeagueDivision implements Serializable {

	private static final long serialVersionUID = 1639733331088910789L;

	private long id;

    private User user;

    private League league;

	private int experience;

	public LeagueDivision() {}

	public LeagueDivision(long id, User user, League league, int experience) {
		this.id = id;
		this.user = user;
		this.league = league;
		this.experience = experience;
	}

}
