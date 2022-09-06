package carRental;

public class ScNode {
	
	private Scooter scooter;
	private ScNode left;
	private ScNode right;
	
	public ScNode(Scooter scooter) {
		this.scooter = scooter;
		this.left = null;
		this.right = null;
	}

	public Scooter getScooter() {
		return scooter;
	}

	public void setScooter(Scooter sc) {
		this.scooter = sc;
	}

	public ScNode getLeft() {
		return left;
	}

	public void setLeft(ScNode left) {
		this.left = left;
	}

	public ScNode getRight() {
		return right;
	}

	public void setRight(ScNode right) {
		this.right = right;
	}
	

}
