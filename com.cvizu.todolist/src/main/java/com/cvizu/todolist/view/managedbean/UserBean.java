package com.cvizu.todolist.view.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.cvizu.todolist.view.entity.User;
import com.cvizu.todolist.view.entity.WorkItem;

@ManagedBean(name = "manageUser")
@SessionScoped
public class UserBean {
	private User user;
	private List<User> users;
	private Long cont = 0L;
	
	public UserBean() {
		user = new User();
		users = new ArrayList<User>();
	}
	
	public void saveUser() {
		if(user.getId() == null) {
			user.setId(cont);
			cont++;
			
			users.add(user);
			System.out.println(user.getUsername());
		}
		user = new User();
	}
	
	public void loadUserForm(User userLoad) {
		user = userLoad;
	}
	
	public void deleteUser(User userRemove) {
		users.remove(userRemove);
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
}
