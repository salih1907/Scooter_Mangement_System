package carRental;

public class UserLinkedList {
	
	private UserNode root;
	private int size;
	
	public UserLinkedList() {
		this.root = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void addUser(User user) {
		UserNode newNode = new UserNode(user);
		if (isEmpty()) {
			root = newNode;
		}else {
			UserNode current = root;
			while(current.getLink() != null) {
				current = current.getLink();
			}
			current.setLink(newNode);
		}
		size++;
	}
	
//	public void removeUser(User user) {
//		UserNode prevNode = root;
//		UserNode currentNode = root;
//		if (root == null) {
//			System.out.println("List is already empty");
//		}else {
//			while (currentNode.getLink() != null) {
//				if (user.getUserID() == currentNode.getUserData().getUserID()) {
//					prevNode.setLink(currentNode.getLink());
//				}
//				prevNode.setLink(currentNode);
//				currentNode = currentNode.getLink();
//				prevNode = prevNode.getLink();
//			}
//		}
//		
//	}
	
	public void removeUser(User user) {
		UserNode temp = root, prev = null;

		// To figure out that the root is going to be deleted.
		if (temp != null && temp.getUserData() == user) {
			root = temp.getLink();
			return;
		}

		// Helps us to find out the temp node that we want to delete
		while (temp != null && temp.getUserData() != user) {
			prev = temp;
			temp = temp.getLink();
		}

		// Checks if the node that we want to delete is found.
		if (temp == null)
			return;

		prev.setLink(temp.getLink()); 
	}
	
	public User[] printUsers() {
		User[] Userlist = new User[10];
		int count = 0;
		UserNode current = root;
		while (current != null) {
			Userlist[count] = current.getUserData();
			current = current.getLink();
			count++;
		}
		return Userlist;
	}
	
	public User search(int id) {
		UserNode current = root;
		while (current != null) {
			if (current.getUserData().getUserID() == id) {
				return current.getUserData();
			}
			current = current.getLink();
		}
		return null;
	}
	
	

}
