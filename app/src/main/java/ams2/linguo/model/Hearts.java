package ams2.linguo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Hearts implements Serializable {

	private static final long serialVersionUID = -6712090737810438347L;

    private User user;

	private int lives;

	private LocalDateTime lostHeart;

	public Hearts() {}

	public Hearts(User user, int lives, LocalDateTime lostHeart) {
		this.user = user;
		this.lives = lives;
		this.lostHeart = lostHeart;
	}

}
