package user;

import java.util.ArrayList;

public class AddUser implements IUser {

	ArrayList<User> users = new ArrayList<>();
	
	@Override
	public void addUser(User user) {
		users.add(user);
		
	}

	@Override
	public void delUser(int id) {
		users.remove(id);
		
	}

	@Override
	public void updateUser(int id, User user) {
		users.set(id, user);
		
	}

	@Override
	public void showUser() {
		for(User us:users) {
			System.out.println("Nickname: "+us.getUserNickname() +
								"\nPasssworrd: " + us.getPassword() +
								"\nName: " + us.getUserName() + 
								"\nSurname: " + us.getUserSurname() + 
								"\nEmail: "+us.getEmail() + "\n----------------------");
			
		}
		
	}
	

}
