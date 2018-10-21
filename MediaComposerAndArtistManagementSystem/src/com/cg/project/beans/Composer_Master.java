package com.cg.project.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@Entity
public class Composer_Master {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int composer_ID;
	private int created_By,updated_By;
	private String composer_Name,composer_CaeipiNumber,composer_MusicSocietyID;
	private Date composer_BornDate,composer_DiedDate,created_On,updated_On;
	private boolean composer_DeletedFlag;
	public Composer_Master() {
		super();
	}
	public Composer_Master(int composer_ID, int created_By, int updated_By,
			String composer_Name, String composer_CaeipiNumber,
			String composer_MusicSocietyID, Date composer_BornDate,
			Date composer_DiedDate, Date created_On, Date updated_On,
			boolean composer_DeletedFlag) {
		super();
		this.composer_ID = composer_ID;
		this.created_By = created_By;
		this.updated_By = updated_By;
		this.composer_Name = composer_Name;
		this.composer_CaeipiNumber = composer_CaeipiNumber;
		this.composer_MusicSocietyID = composer_MusicSocietyID;
		this.composer_BornDate = composer_BornDate;
		this.composer_DiedDate = composer_DiedDate;
		this.created_On = created_On;
		this.updated_On = updated_On;
		this.composer_DeletedFlag = composer_DeletedFlag;
	}
	public int getComposer_ID() {
		return composer_ID;
	}
	public void setComposer_ID(int composer_ID) {
		this.composer_ID = composer_ID;
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
	public String getComposer_Name() {
		return composer_Name;
	}
	public void setComposer_Name(String composer_Name) {
		this.composer_Name = composer_Name;
	}
	public String getComposer_CaeipiNumber() {
		return composer_CaeipiNumber;
	}
	public void setComposer_CaeipiNumber(String composer_CaeipiNumber) {
		this.composer_CaeipiNumber = composer_CaeipiNumber;
	}
	public String getComposer_MusicSocietyID() {
		return composer_MusicSocietyID;
	}
	public void setComposer_MusicSocietyID(String composer_MusicSocietyID) {
		this.composer_MusicSocietyID = composer_MusicSocietyID;
	}
	public Date getComposer_BornDate() {
		return composer_BornDate;
	}
	public void setComposer_BornDate(Date composer_BornDate) {
		this.composer_BornDate = composer_BornDate;
	}
	public Date getComposer_DiedDate() {
		return composer_DiedDate;
	}
	public void setComposer_DiedDate(Date composer_DiedDate) {
		this.composer_DiedDate = composer_DiedDate;
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
	public boolean isComposer_DeletedFlag() {
		return composer_DeletedFlag;
	}
	public void setComposer_DeletedFlag(boolean composer_DeletedFlag) {
		this.composer_DeletedFlag = composer_DeletedFlag;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((composer_BornDate == null) ? 0 : composer_BornDate
						.hashCode());
		result = prime
				* result
				+ ((composer_CaeipiNumber == null) ? 0 : composer_CaeipiNumber
						.hashCode());
		result = prime * result + (composer_DeletedFlag ? 1231 : 1237);
		result = prime
				* result
				+ ((composer_DiedDate == null) ? 0 : composer_DiedDate
						.hashCode());
		result = prime * result + composer_ID;
		result = prime
				* result
				+ ((composer_MusicSocietyID == null) ? 0
						: composer_MusicSocietyID.hashCode());
		result = prime * result
				+ ((composer_Name == null) ? 0 : composer_Name.hashCode());
		result = prime * result + created_By;
		result = prime * result
				+ ((created_On == null) ? 0 : created_On.hashCode());
		result = prime * result + updated_By;
		result = prime * result
				+ ((updated_On == null) ? 0 : updated_On.hashCode());
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
		Composer_Master other = (Composer_Master) obj;
		if (composer_BornDate == null) {
			if (other.composer_BornDate != null)
				return false;
		} else if (!composer_BornDate.equals(other.composer_BornDate))
			return false;
		if (composer_CaeipiNumber == null) {
			if (other.composer_CaeipiNumber != null)
				return false;
		} else if (!composer_CaeipiNumber.equals(other.composer_CaeipiNumber))
			return false;
		if (composer_DeletedFlag != other.composer_DeletedFlag)
			return false;
		if (composer_DiedDate == null) {
			if (other.composer_DiedDate != null)
				return false;
		} else if (!composer_DiedDate.equals(other.composer_DiedDate))
			return false;
		if (composer_ID != other.composer_ID)
			return false;
		if (composer_MusicSocietyID == null) {
			if (other.composer_MusicSocietyID != null)
				return false;
		} else if (!composer_MusicSocietyID
				.equals(other.composer_MusicSocietyID))
			return false;
		if (composer_Name == null) {
			if (other.composer_Name != null)
				return false;
		} else if (!composer_Name.equals(other.composer_Name))
			return false;
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
		return true;
	}
	@Override
	public String toString() {
		return "Composer_Master [composer_ID=" + composer_ID + ", created_By="
				+ created_By + ", updated_By=" + updated_By
				+ ", composer_Name=" + composer_Name
				+ ", composer_CaeipiNumber=" + composer_CaeipiNumber
				+ ", composer_MusicSocietyID=" + composer_MusicSocietyID
				+ ", composer_BornDate=" + composer_BornDate
				+ ", composer_DiedDate=" + composer_DiedDate + ", created_On="
				+ created_On + ", updated_On=" + updated_On
				+ ", composer_DeletedFlag=" + composer_DeletedFlag + "]";
	}
	
	
}
