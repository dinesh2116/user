package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.AdduserDAO;
import dao.LoginDAO;
import model.AddUser;
import model.Login;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int option,option1,editopt;
		
		Login login= new Login();
		LoginDAO logindao =new LoginDAO();
		AddUser adduser =new AddUser();
		AdduserDAO adduserdao =new AdduserDAO();
		
		
		do {
			System.out.println("1.Admin");
			System.out.println("2.User");
			System.out.println("3.exit");
			System.out.println("********************");
			option=Integer.parseInt(br.readLine());
			
			
			switch(option){
				case 1:{
					System.out.println("Welcome to admin");
					System.out.println("Enter username");
					String username=br.readLine();
					System.out.println("Enter Password");
					String password=br.readLine();
					login.setUsername(username);
					login.setPassword(password);
					
					if(logindao.validate(login)==true) {
						System.out.println("******************");
						System.out.println("Login successful...!");
						
						do {
							System.out.println("1.Add User");
							System.out.println("2.Edit User");
							System.out.println("3.Delete user");
							System.out.println("4.View user");
							System.out.println("********************");
							option1=Integer.parseInt(br.readLine());
							
							switch(option1) {
							case 1:{
								System.out.println("Welcome to Add User");
								System.out.println("Enter new user name");
								String username1=br.readLine();
								System.out.println("Enter new user Password");
								String password1=br.readLine();
								adduser.setUsername(username1);
								adduser.setPassword(password1);
								
								adduserdao.adduser(adduser);
								System.out.println("User Added Successfully...!");
								
								break;
							}
							case 2:
								System.out.println("Welcome to Edit user");
								System.out.println("1.Edit Username");
								System.out.println("2.Edit Password");
								editopt=Integer.parseInt(br.readLine());
								
								switch(editopt) {
								case 1:
								{
									System.out.println(" Welcome to Edit Username");
									System.out.println("Enter old username");
									String oldusername=br.readLine();
									System.out.println("Enter New username");
									String newusername=br.readLine();
									adduser.setOldusername(oldusername);
									adduser.setNewusername(newusername);
									
									adduserdao.editusername(adduser);
									System.out.println("Successfully Updated");
								}
								}
								
							case 3:
							{
								System.out.println(" Welcome to Delete Username");
								System.out.println("Enter the Delete username");
								String deleteuser=br.readLine();
								adduser.setDeleteuser(deleteuser);
								adduserdao.deleteuser(adduser);
								System.out.println("Successfully Deleted");
							}
							
							case 4:{
								System.out.println("Welcome to View all user");
								adduserdao.viewalluser(adduser);
							}
								
							}
							
						}while(option1 !=4);
						
					}
					
					break;
					
				}
				
			}
			
			
			
			
		}while(option!=3);
		

	}

}
