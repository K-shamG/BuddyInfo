import java.util.ArrayList;
import java.util.List;

//new comment
public class AddressBook {
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		buddyInfo = new ArrayList<BuddyInfo>(); 
	}
	
	public void addBuddy(BuddyInfo buddy) {
		if(buddyInfo != null){
			buddyInfo.add(buddy);
		}
	}
	
	public BuddyInfo removeBuddy(int i) {
		if(i >= 0 && i < this.buddyInfo.size()) {
			return buddyInfo.remove(i);
		}
		return null;
	}
	
	public static void main(String [] args) {
		BuddyInfo buddy = new BuddyInfo("Kshamina", "ottawa", 6666666);
		AddressBook book = new AddressBook(); 
		book.addBuddy(buddy);
		book.removeBuddy(0);
	}
}
