package user;

import java.util.Scanner;

public class CreateUser {

	public static void main(String[] args) {
		AddUser makeUser = new AddUser();
	
		
		while(true) {	
			try {
			
			System.out.println("please choose a number \n1- Add User\n2-Delete User\n3-Update User\n4-show user\n5-Exit");
			
			Scanner sc = new Scanner(System.in);
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				System.out.println("Nickname: ");
				String nickname = sc.nextLine();
				System.out.println("Password: ");
				String password = sc.nextLine();
				System.out.println("Name");
				String name = sc.nextLine();
				System.out.println("Surname");
				String surname = sc.nextLine();
				System.out.println("Eamil");
				String email = sc.nextLine();
				
				User user = new User(nickname, password, surname, surname, email);
				makeUser.addUser(user);
				
			}
			else if(choice == 2) {
				int id =sc.nextInt();
				makeUser.delUser(id);
				System.out.println("user "+ id + "deleted");
				
			}
			else if(choice == 3) {
				System.out.print("Nickname: ");
				String nickname = sc.nextLine();
				System.out.print("Password: ");
				String password = sc.nextLine();
				System.out.print("Name");
				String name = sc.nextLine();
				System.out.print("Surname");
				String surname = sc.nextLine();
				System.out.print("Eamil");
				String email = sc.nextLine();
				
				System.out.println("which user do you want to update");
				int id = sc.nextInt();
				
				User user = new User(nickname, password, surname, surname, email);
				makeUser.updateUser(id, user);
							
				}
			else if(choice == 4) {
				makeUser.showUser();
				
			}
			else if(choice == 5) {
				
				System.out.println("you have left the site");
				break;
			}
			
			
		} catch (Exception e) {
			System.err.println("please type correctly");
		}
		}
		

	}

}
