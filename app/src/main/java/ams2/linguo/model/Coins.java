package ams2.linguo.model;

import java.io.Serializable;

public class Coins implements Serializable {

	private static final long serialVersionUID = 3707850022410876209L;

    private User user;

	private int currency;

	public Coins() {}

	public Coins(User user, int currency) {
		this.user = user;
		this.currency = currency;
	}

}
