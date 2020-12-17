package ams2.linguo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Friendship implements Serializable {

	private static final long serialVersionUID = -4426824883866079814L;

    private User user1;

    private User user2;

	private LocalDateTime date;

	public Friendship() {}

	public Friendship(User user1, User user2, LocalDateTime date) {
		this.user1 = user1;
		this.user2 = user2;
		this.date = date;
	}	

}
