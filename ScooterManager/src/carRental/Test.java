package carRental;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User(10, "salih", 21);
		User u2 = new User(10, "salih", 21);
		User u3 = new User(10, "salih", 21);
		User u4 = new User(10, "salih", 21);
		User u5 = new User(10, "salih", 21);
		User u6 = new User(10, "salih", 21);
		
		UserLinkedList Ulist = new UserLinkedList();
		Ulist.addUser(u1);
		Ulist.addUser(u2);
		Ulist.addUser(u3);
		Ulist.addUser(u4);
		Ulist.addUser(u5);
		Ulist.addUser(u6);
		
		Ulist.removeUser(u1);
		
		
		
		for (int i = 0; i < Ulist.printUsers().length; i++) {
			System.out.println(Ulist.printUsers()[i]);
		}
		System.out.println(Ulist.printUsers().length);
		
		
		Scooter c1 = new Scooter(1, "reanult",  5);
		Scooter c2 = new Scooter(2, "ferrari",  20);
		Scooter c3 = new Scooter(3, "suzuki",  3);
		Scooter c4 = new Scooter(4, "citroen",  15);
		Scooter c5 = new Scooter(5, "fiat", 10);
		
		c2.setLastUser(u1);
		ScTree CT = new ScTree();
		
		CT.addNewScooter(c1);
		CT.addNewScooter(c2);
		CT.addNewScooter(c3); 
		CT.addNewScooter(c4);
		CT.addNewScooter(c5);
		
		CT.inorder(CT.getRoot());
		String[] Scooters = CT.ScooterList.split("/");
		for (int i = 0; i < CT.ScooterList.split("/").length; i++) {
			System.out.println(Scooters[i]);
		}
		
		

	}

}
