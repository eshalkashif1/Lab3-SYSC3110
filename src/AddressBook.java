import java.util.*;

public class AddressBook {

    private ArrayList<buddyInfo> buddies;

    public AddressBook(){
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(buddyInfo buddy){
        if(buddies!=null) {
            buddies.add(buddy);
        }
    }

    public void removeBuddy(buddyInfo buddy){
        buddies.remove(buddy);
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}
