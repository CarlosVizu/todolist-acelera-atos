package com.cvizu.todolist.view.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.cvizu.todolist.view.entity.User;
import com.cvizu.todolist.view.entity.WorkItem;

@ManagedBean(name = "manageToDoList")
@SessionScoped
public class ToDoListBean {
	@ManagedProperty(value = "#{manageUser}")
	private UserBean userBean;
	private User user;
	private List<User> users;
	private WorkItem workItem;
	private List<WorkItem> workItems;
	private Long cont = 0L;
	
	
	
	public ToDoListBean() {
		users = new ArrayList<User>();
		workItem = new WorkItem();
		workItems = new ArrayList<WorkItem>();
	}
	
	
	public User getSelectedUser() {
	    return userBean.getUser();
	}
	
	public void saveWorkItem() {
		if(workItem.getId() == null) {
			workItem.setId(cont);
			cont++;
			
			workItems.add(workItem);
			System.out.println(workItem.getTitle());
		}
		workItem = new WorkItem();
	}
	
	public void loadWorkItemForm(WorkItem wItem) {
		workItem = wItem;
	}
	
	public void deleteWorkItem(WorkItem wItem) {
		workItems.remove(wItem);
	}
	
	
	//Getters and setters
	public List<User> getUsers() {
		return users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}


	public WorkItem getWorkItem() {
		return workItem;
	}


	public void setWorkItem(WorkItem workItem) {
		this.workItem = workItem;
	}


	public List<WorkItem> getWorkItems() {
		return workItems;
	}


	public void setWorkItems(List<WorkItem> workItems) {
		this.workItems = workItems;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
