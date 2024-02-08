package com.cvizu.todolist.view.entity;

import java.util.Objects;

public class WorkItem {
	 	private Long id;
	    private String title;
	    private String description;
	    private User user;

	    // Getters and setters

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

		@Override
		public int hashCode() {
			return Objects.hash(description, id, title);
		}
		

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			WorkItem other = (WorkItem) obj;
			return Objects.equals(description, other.description) && Objects.equals(id, other.id)
					&& Objects.equals(title, other.title);
		}
	    
	    
}
