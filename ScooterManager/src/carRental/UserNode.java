package carRental;

public class UserNode {
	
	private User UserData;
	private UserNode link;
	
	public UserNode(User userData) {
		this.UserData = userData;
		this.link = null;
	}
	
	public UserNode(User userData,UserNode link) {
		this.link = link;
		this.UserData = userData;
	}

	public User getUserData() {
		return UserData;
	}

	public void setUserData(User userData) {
		UserData = userData;
	}

	public UserNode getLink() {
		return link;
	}

	public void setLink(UserNode link) {
		this.link = link;
	}
	
	

}
