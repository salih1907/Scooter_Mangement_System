package carRental;

public class Scooter {
	private int ScooterID;
	private User lastUser;
	private String ScLocation;
	private float batteryPer;
	private boolean isBroken;

	public Scooter(int ScooterID, String sclocation,float batteryPer) {
		this.ScLocation = sclocation;
		this.batteryPer = batteryPer;
		this.ScooterID = ScooterID;
		this.lastUser = null;
		this.isBroken = false;
	}

	public int getScooterID() {
		return ScooterID;
	}

	public void setScooterID(int scooterID) {
		ScooterID = scooterID;
	}

	public User getLastUser() {
		return lastUser;
	}

	public void setLastUser(User lastUser) {
		this.lastUser = lastUser;
	}

	public String getScLocation() {
		return ScLocation;
	}

	public void setScLocation(String scLocation) {
		ScLocation = scLocation;
	}

	public Float getBatteryPer() {
		return batteryPer;
	}

	public void setBatteryPer(Float batteryPer) {
		this.batteryPer = batteryPer;
	}

	public boolean isBroken() {
		return isBroken;
	}

	public void setBroken(boolean isBroken) {
		this.isBroken = isBroken;
	}

	@Override
	public String toString() {
		if (isBroken) {
			if (lastUser == null) {
				return this.ScooterID + " - " + this.ScLocation + " | %" + this.batteryPer + "  *Repair Required*";
			}else {
				return this.ScooterID + " - " + this.ScLocation + " | %" + this.batteryPer + "  - (Last User: "
						+ lastUser.getUserName() + ") *Repair Required*";
			}
			
			
		} else {
			if (lastUser == null) {
				return this.ScooterID + " - " + this.ScLocation + " | %" + this.batteryPer + " ";

			} else {
				return this.ScooterID + " - " + this.ScLocation + " | %" + this.batteryPer + "  - (Last User: "
						+ lastUser.getUserName() + ") ";

			}
		}

	}

}
