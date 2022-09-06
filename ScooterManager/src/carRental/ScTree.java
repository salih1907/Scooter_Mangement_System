package carRental;

public class ScTree {
	
	private ScNode root;
	private int size;
	public String ScooterList = "";
	
	public ScTree() {
		root = null;
		size = 0;
	}

	public ScNode getRoot() {
		return root;
	}
	
	private ScNode createNewNode(Scooter scooter) {
		return new ScNode(scooter);
	}

	public void setRoot(ScNode root) {
		this.root = root;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	public boolean addNewScooter(Scooter Scooter) {
		if (root == null) {
			root = createNewNode(Scooter);
		}
		else {
			ScNode parent = null;
			ScNode current = root;
			while (current != null) {
				if (Scooter.getBatteryPer() < current.getScooter().getBatteryPer()) {
					parent = current;
					current = current.getLeft();
				}
				else if(Scooter.getBatteryPer() > current.getScooter().getBatteryPer()) {
					parent = current;
					current = current.getRight();
				}else {
					return false;
				}
				
			}
			if (Scooter.getBatteryPer() < parent.getScooter().getBatteryPer()) {
				parent.setLeft(createNewNode(Scooter));
			}else {
				parent.setRight(createNewNode(Scooter));
			}
			
		}
		size++;
		return true;
	}
	
	public void inorder(ScNode root) {
		if (root == null) {
			return;
		}
		inorder(root.getLeft());
		ScooterList += "/"+root.getScooter();
		inorder(root.getRight());
	}
	
	public boolean delete(float battery) {
		ScNode parent = null;
		ScNode current = root;
		while (current != null) {
			if (battery < current.getScooter().getBatteryPer()) {
				parent = current;
				current = current.getLeft();
			}else if(battery > current.getScooter().getBatteryPer()){
				parent = current;
				current = current.getRight();
			}
			else {
				break;
			}
			
		}
		if (current == null) {
			return false;
		}
		if (current.getLeft()== null) {
			if (parent == null) {
				root = current.getRight();
			}else {
				if (battery < parent.getScooter().getBatteryPer()) {
					parent.setLeft(current.getRight());
				}else {
					parent.setRight(current.getRight());
				}
			}
		}
		else {
			ScNode parentOfRightMost = current;
			ScNode rightMost = current.getLeft();
			while (rightMost.getRight() != null) {
				parentOfRightMost = rightMost;
				rightMost = rightMost.getRight();
			}
			current.setScooter(rightMost.getScooter());
			if (parentOfRightMost.getRight() == rightMost) {
				parentOfRightMost.setRight(rightMost.getLeft());
			}else {
				parentOfRightMost.setLeft(rightMost.getLeft());
			}
		}
		size--;
		return true;
	}
	
	public ScNode search(float battery) {
		ScNode current = root;
		while(current != null) {
			if (battery < current.getScooter().getBatteryPer()) {
				current = current.getLeft();
			}else if (battery > current.getScooter().getBatteryPer()) {
				current = current.getRight();
			}else
				return current;
		}
		return null;
	}

}
