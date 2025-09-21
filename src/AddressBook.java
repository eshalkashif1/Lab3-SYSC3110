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

        buddyInfo bud1 = new buddyInfo();
        AddressBook book1 = new AddressBook();
        book1.addBuddy(bud1);
        book1.removeBuddy(bud1);

        System.out.println("1 Buddy added to Address Book");
        System.out.println("This is a change made on GitHub");

    }
}
