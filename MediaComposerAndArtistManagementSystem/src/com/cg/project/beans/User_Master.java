package com.cg.project.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User_Master {
	@Id
	private int user_ID;
	private String user_Password;
	private int created_By,updated_By;
	private Date created_On,updated_On;
	
	public User_Master() {
		super();
	}

	public User_Master(int user_ID, String user_Password, int created_By,
			int updated_By, Date created_On, Date updated_On) {
		super();
		this.user_ID = user_ID;
		this.user_Password = user_Password;
		this.created_By = created_By;
		this.updated_By = updated_By;
		this.created_On = created_On;
		this.updated_On = updated_On;
	}

	public int getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public String getUser_Password() {
		return user_Password;
	}

	public void setUser_Password(String user_Password) {
		this.user_Password = user_Password;
	}

	public int getCreated_By() {
		return created_By;
	}

	public void setCreated_By(int created_By) {
		this.created_By = created_By;
	}

	public int getUpdated_By() {
		return updated_By;
	}

	public void setUpdated_By(int updated_By) {
		this.updated_By = updated_By;
	}

	public Date getCreated_On() {
		return created_On;
	}

	public void setCreated_On(Date created_On) {
		this.created_On = created_On;
	}

	public Date getUpdated_On() {
		return updated_On;
	}

	public void setUpdated_On(Date updated_On) {
		this.updated_On = updated_On;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + created_By;
		result = prime * result
				+ ((created_On == null) ? 0 : created_On.hashCode());
		result = prime * result + updated_By;
		result = prime * result
				+ ((updated_On == null) ? 0 : updated_On.hashCode());
		result = prime * result + user_ID;
		result = prime * result
				+ ((user_Password == null) ? 0 : user_Password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User_Master other = (User_Master) obj;
		if (created_By != other.created_By)
			return false;
		if (created_On == null) {
			if (other.created_On != null)
				return false;
		} else if (!created_On.equals(other.created_On))
			return false;
		if (updated_By != other.updated_By)
			return false;
		if (updated_On == null) {
			if (other.updated_On != null)
				return false;
		} else if (!updated_On.equals(other.updated_On))
			return false;
		if (user_ID != other.user_ID)
			return false;
		if (user_Password == null) {
			if (other.user_Password != null)
				return false;
		} else if (!user_Password.equals(other.user_Password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User_Master [user_ID=" + user_ID + ", user_Password="
				+ user_Password + ", created_By=" + created_By
				+ ", updated_By=" + updated_By + ", created_On=" + created_On
				+ ", updated_On=" + updated_On + "]";
	}
		
}
