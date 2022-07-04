package user;

public class User {
	
	private String userNickname;
	private String password;
	private String userName;
	private String userSurname;
	private String email;
	public User(String userNickname, String password, String userName, String userSurname, String email) {
		this.userNickname = userNickname;
		this.password = password;
		this.userName = userName;
		this.userSurname = userSurname;
		this.email = email;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
