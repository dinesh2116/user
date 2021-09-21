package model;

public class AddUser {
	private String username;
	private String password;
	private String oldusername;
	private String newusername;
	private String oldpassword;
	private String newpassword;
	private String deleteuser;
	
	public String getDeleteuser() {
		return deleteuser;
	}
	public void setDeleteuser(String deleteuser) {
		this.deleteuser = deleteuser;
	}
	public String getOldusername() {
		return oldusername;
	}
	public void setOldusername(String oldusername) {
		this.oldusername = oldusername;
	}
	public String getNewusername() {
		return newusername;
	}
	public void setNewusername(String newusername) {
		this.newusername = newusername;
	}
	public String getOldpassword() {
		return oldpassword;
	}
	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
