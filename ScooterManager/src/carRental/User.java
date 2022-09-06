package carRental;
import java.util.ArrayList;

public class User {

private int UserID;
private String UserName;
private int UserAge;
private ArrayList<Scooter> RentedScooters;

public User(int UserID,String UserName,int UserAge) {
	this.UserAge = UserAge;
	this.UserID = UserID;
	this.UserName = UserName;
	this.RentedScooters = new ArrayList<Scooter>();
}

public int getUserID() {
	return UserID;
}

public void setUserID(int userID) {
	UserID = userID;
}

public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
}

public int getUserAge() {
	return UserAge;
}

public void setUserAge(int userAge) {
	UserAge = userAge;
}

public void AddScooter(Scooter sc) {
	this.RentedScooters.add(sc);
}

public ArrayList<Scooter> getRentedScooters() {
	return RentedScooters;
}

@Override
public String toString() {
	return UserID + " - "+UserName+" ( " +UserAge+" )"; 
}

}
