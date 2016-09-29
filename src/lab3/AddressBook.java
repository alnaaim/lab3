package lab3;
import java.util.*;

public class AddressBook {
	ArrayList <Buddyinfo>list;
	
	public AddressBook(){
		list = new ArrayList<Buddyinfo>();
		
	}
	
	public void addBuddy(Buddyinfo b){
		list.add(b);
	}
	
	public void removeBuddy(Buddyinfo b){
		list.remove(b);
	}
	
	public Buddyinfo getB(int index){
		return list.get(index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buddyinfo x1, x2;
		AddressBook temp = new AddressBook();
	
		x1 = new Buddyinfo("Abdul", "260", 514);
		x2 = new Buddyinfo("Jamal", "260", 819);
		temp.addBuddy(x1); // Adding buddy 1
		temp.addBuddy(x2); // adding buddy 2
		temp.removeBuddy(x1);
		System.out.println("Hello " + temp.getB(0).getName() + "!");
	}

}