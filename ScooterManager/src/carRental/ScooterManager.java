package carRental;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class ScooterManager extends JFrame implements MouseListener, ActionListener {

	private JPanel contentPane;
	DefaultListModel dlm = new DefaultListModel();
	DefaultListModel dlm2 = new DefaultListModel();
	private JList list = new JList(dlm);

	JScrollPane scrollPane = new JScrollPane();

	String State;

	private JTextField Scootertxt;
	private JTextField Locationtxt;
	private JTextField Batterytxt;

	JButton DeleteScooterbtn = new JButton("Delete Item");
	JButton AddScooterbtn = new JButton("Add Scooter");
	JButton Scooterbtn = new JButton("Scooters");
	JButton Userbtn = new JButton("Users");
	JButton UseScooterbtn = new JButton("Use Scooter");
	JButton LastUserbtn = new JButton("Add Last User");
	JButton ScooterListBtn = new JButton("Scooter List");

	JList list_2 = new JList(dlm2);
	ScTree CT = new ScTree();

	Scooter c1 = new Scooter(1, "istanbul_beþiktaþ", 5);
	Scooter c2 = new Scooter(2, "istanbul_kadýköy", 20);
	Scooter c3 = new Scooter(3, "istanbul_üsküdar", 3);
	Scooter c4 = new Scooter(4, "istanbul_maltepe", 15);
	Scooter c5 = new Scooter(5, "istanbul_beylikdüzü", 10);
	Scooter c6 = new Scooter(6, "istanbul_sarýyer", 60);

	User u1 = new User(2, "Salih", 21);
	User u2 = new User(9, "Baraah", 21);
	User u3 = new User(7, "Alex", 22);
	User u4 = new User(5, "John", 61);
	User u5 = new User(11, "Hasan", 42);
	User u6 = new User(3, "Teresa", 35);

	UserLinkedList Ulist = new UserLinkedList();
	private JTextField UseScootertxt = new JTextField();

	JScrollPane scPane = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScooterManager frame = new ScooterManager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ScooterManager() {
		UseScootertxt.setHorizontalAlignment(SwingConstants.CENTER);
		UseScootertxt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		UseScootertxt.setBounds(342, 152, 149, 20);
		UseScootertxt.setColumns(10);
		setTitle("Scooter Manager");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 464);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Scooterbtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Scooterbtn.setBackground(Color.LIGHT_GRAY);
		Scooterbtn.setBounds(181, 346, 129, 68);
		contentPane.add(Scooterbtn);

		Userbtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Userbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Userbtn.setBackground(Color.LIGHT_GRAY);
		Userbtn.setBounds(42, 346, 129, 68);
		contentPane.add(Userbtn);
		list.setFont(new Font("Tahoma", Font.PLAIN, 11));
		list.setBackground(Color.LIGHT_GRAY);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(10, 11, 322, 317);
		contentPane.add(list);

		list_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		list_2.setBackground(Color.LIGHT_GRAY);
		list_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_2.setBounds(342, 11, 271, 130);
		contentPane.add(list_2);

		JLabel ScooterID = new JLabel("Scooter ID:");
		ScooterID.setForeground(Color.WHITE);
		ScooterID.setHorizontalAlignment(SwingConstants.LEFT);
		ScooterID.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ScooterID.setBounds(342, 252, 84, 14);
		contentPane.add(ScooterID);

		Scootertxt = new JTextField();
		Scootertxt.setBounds(424, 249, 189, 20);
		contentPane.add(Scootertxt);
		Scootertxt.setColumns(10);

		JLabel Location = new JLabel("Location :");
		Location.setForeground(Color.WHITE);
		Location.setHorizontalAlignment(SwingConstants.LEFT);
		Location.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Location.setBounds(342, 283, 84, 14);
		contentPane.add(Location);

		Locationtxt = new JTextField();
		Locationtxt.setBounds(424, 280, 189, 20);
		contentPane.add(Locationtxt);
		Locationtxt.setColumns(10);

		JLabel Battery = new JLabel("Battery % :");
		Battery.setForeground(Color.WHITE);
		Battery.setHorizontalAlignment(SwingConstants.LEFT);
		Battery.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Battery.setBounds(342, 314, 84, 14);
		contentPane.add(Battery);

		Batterytxt = new JTextField();
		Batterytxt.setBounds(424, 308, 189, 20);
		contentPane.add(Batterytxt);
		Batterytxt.setColumns(10);

		AddScooterbtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		AddScooterbtn.setBackground(Color.LIGHT_GRAY);
		AddScooterbtn.setBounds(368, 346, 107, 68);
		contentPane.add(AddScooterbtn);

		DeleteScooterbtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		DeleteScooterbtn.setBackground(Color.LIGHT_GRAY);
		DeleteScooterbtn.setBounds(485, 346, 115, 68);
		contentPane.add(DeleteScooterbtn);

		UseScooterbtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		UseScooterbtn.setBackground(Color.LIGHT_GRAY);
		UseScooterbtn.setBounds(501, 191, 112, 35);
		contentPane.add(UseScooterbtn);

		LastUserbtn.setBackground(Color.LIGHT_GRAY);
		LastUserbtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		LastUserbtn.setBounds(352, 183, 129, 50);
		contentPane.add(LastUserbtn);

		contentPane.add(UseScootertxt);
		ScooterListBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ScooterListBtn.setBackground(Color.LIGHT_GRAY);

		ScooterListBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ScooterListBtn.setBounds(501, 152, 112, 35);
		contentPane.add(ScooterListBtn);

		c1.setBroken(true);
		c2.setLastUser(u1);
		c2.setBroken(true);

		Ulist.addUser(u1);
		Ulist.addUser(u2);
		Ulist.addUser(u3);
		Ulist.addUser(u4);
		Ulist.addUser(u5);
		Ulist.addUser(u6);

		CT.addNewScooter(c1);
		CT.addNewScooter(c2);
		CT.addNewScooter(c3);
		CT.addNewScooter(c4);
		CT.addNewScooter(c5);
		CT.addNewScooter(c6);

		CT.inorder(CT.getRoot());
		String[] Scooters = CT.ScooterList.split("/");
		for (int i = 0; i < CT.ScooterList.split("/").length; i++) {
			dlm.addElement(Scooters[i]);
		}
		Userbtn.addMouseListener(this);
		Scooterbtn.addMouseListener(this);
		DeleteScooterbtn.addMouseListener(this);
		AddScooterbtn.addMouseListener(this);
		UseScooterbtn.addMouseListener(this);
		LastUserbtn.addMouseListener(this);
		ScooterListBtn.addMouseListener(this);
		u1.AddScooter(c1);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == DeleteScooterbtn) {
			if (list.getSelectedIndex() != -1 && State.equals("Scooters")) {
				String[] battery = list.getSelectedValue().toString().split(" ");
				float batteryPer = Float.parseFloat(battery[4].substring(1));
				CT.delete(CT.search(batteryPer).getScooter().getBatteryPer());
				dlm.clear();
				CT.ScooterList = "";
				CT.inorder(CT.getRoot());
				String[] Scooters = CT.ScooterList.split("/");
				for (int i = 0; i < CT.ScooterList.split("/").length; i++) {
					dlm.addElement(Scooters[i]);
				}

			}
			else if (list.getSelectedIndex() != -1 && State.equals("Users")) {
				String userName = list.getSelectedValue().toString();
				int userID = Integer.parseInt(userName.split("-")[0].strip());
				User user = Ulist.search(userID);
				Ulist.removeUser(user);
				dlm.clear();
				for (int i = 0; i < Ulist.printUsers().length; i++) {
					if (Ulist.printUsers()[i] != null) {
						dlm.addElement(Ulist.printUsers()[i]);
					}
				}
				
			} 
			else if (list_2.getSelectedIndex() != -1) {
				dlm2.remove(list_2.getSelectedIndex());
			}
		}
		if (e.getSource() == AddScooterbtn) {

			if (Scootertxt.getText().equals("") || Locationtxt.getText().equals("")
					|| Batterytxt.getText().equals("")) {
				Locationtxt.setText("Please fill the areas");
			} else {
				int ScooterID = Integer.parseInt(Scootertxt.getText());
				float battery = Float.parseFloat(Batterytxt.getText()) ;             
				String Location = Locationtxt.getText();
				Scooter sc = new Scooter(ScooterID, Location, battery);
				dlm.clear();
				CT.addNewScooter(sc);
				CT.ScooterList = "";
				CT.inorder(CT.getRoot());
				String[] Scooters = CT.ScooterList.split("/");
				for (int i = 0; i < CT.ScooterList.split("/").length; i++) {
					dlm.addElement(Scooters[i]);
				}

			}

		}
		if (e.getSource() == Userbtn) {
			dlm.clear();
			for (int i = 0; i < Ulist.printUsers().length; i++) {
				if (Ulist.printUsers()[i] != null) {
					dlm.addElement(Ulist.printUsers()[i].toString());
				}
			}
			dlm2.clear();
			String[] Scooters = CT.ScooterList.split("/");
			for (int i = 0; i < CT.ScooterList.split("/").length; i++) {
				dlm2.addElement(Scooters[i]);
			}
			State = "Users";

		}
		if (e.getSource() == Scooterbtn) {
			dlm2.clear();
			for (int i = 0; i < Ulist.printUsers().length; i++) {
				if (Ulist.printUsers()[i] != null) {
					dlm2.addElement(Ulist.printUsers()[i].toString());
				}

			}
			dlm.clear();
			String[] Scooters = CT.ScooterList.split("/");
			for (int i = 0; i < CT.ScooterList.split("/").length; i++) {
				dlm.addElement(Scooters[i]);
			}
			State = "Scooters";

		}
		if (e.getSource() == UseScooterbtn) {
			if (State.equals("Users") && list.getSelectedIndex() != -1 && list_2.getSelectedIndex() != -1) {
				String[] battery = list_2.getSelectedValue().toString().split(" ");
				float batteryPer = Float.parseFloat(battery[4].substring(1));
				ScNode Scooter = CT.search(batteryPer);

				String userName = list.getSelectedValue().toString();
				int userID = Integer.parseInt(userName.split("-")[0].strip());
				User user = Ulist.search(userID);
				user.AddScooter(Scooter.getScooter());

				UseScootertxt.setText("*Scooter Added*");
			}
		}

		if (e.getSource() == LastUserbtn) {
			if (State.equals("Scooters") && list.getSelectedIndex() != -1 && list_2.getSelectedIndex() != -1) {
				String[] battery = list.getSelectedValue().toString().split(" ");
				float batteryPer = Float.parseFloat(battery[4].substring(1));
				ScNode Scooter = CT.search(batteryPer);
				String user = list_2.getSelectedValue().toString();
				int userID = Integer.parseInt(user.split("-")[0].strip());
				Scooter.getScooter().setLastUser(Ulist.search(userID));
				dlm.clear();
				CT.ScooterList = "";
				CT.inorder(CT.getRoot());

				String[] Scooters = CT.ScooterList.split("/");
				for (int i = 0; i < CT.ScooterList.split("/").length; i++) {
					dlm.addElement(Scooters[i]);
				}

				UseScootertxt.setText("*Last User Added*");
			}
		}
		if (e.getSource() == ScooterListBtn) {
			if (State.equals("Users") && list.getSelectedIndex() != -1) {

				String userName = list.getSelectedValue().toString();
				int userID = Integer.parseInt(userName.split("-")[0].strip());
				User user = Ulist.search(userID);
				dlm2.clear();
				for (int i = 0; i < user.getRentedScooters().size(); i++) {
					dlm2.addElement(user.getRentedScooters().get(i));
				}

			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
