import java.util.ArrayList;

public class BuddyInfo {
	private String name, address;
	private int phoneNumber;
	private ArrayList<BuddyInfo> buddyInfo;
	
	public BuddyInfo(String name, String address, int num) {
		this.name = name;
		this.address = address;
		this.phoneNumber = num; 
		buddyInfo = new ArrayList<BuddyInfo>(); 
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void addBuddy(BuddyInfo buddy) {
		buddyInfo.add(buddy);
	}
	
	public void removeBuddy(BuddyInfo buddy) {
		buddyInfo.remove(buddy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		BuddyInfo buddy = new BuddyInfo("Kshamina", "fhdjksf", 7897);
		System.out.println("Hello " + buddy.getName());
	}

}
