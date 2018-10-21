package com.cg.project.beans;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@Entity
public class Artist_Master {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int artist_ID;
	private int created_By, updated_By;
	private String artist_Name;
	private Date artist_BornDate, artist_DiedDate, created_On, updated_On;
	private boolean artist_DeletedFlag;
	private char artist_Type;
	public Artist_Master() {
		super();
	}
	public Artist_Master(int artist_ID, int created_By, int updated_By,
			String artist_Name, Date artist_BornDate, Date artist_DiedDate,
			Date created_On, Date updated_On, boolean artist_DeletedFlag,
			char artist_Type) {
		super();
		this.artist_ID = artist_ID;
		this.created_By = created_By;
		this.updated_By = updated_By;
		this.artist_Name = artist_Name;
		this.artist_BornDate = artist_BornDate;
		this.artist_DiedDate = artist_DiedDate;
		this.created_On = created_On;
		this.updated_On = updated_On;
		this.artist_DeletedFlag = artist_DeletedFlag;
		this.artist_Type = artist_Type;
	}
	public int getArtist_ID() {
		return artist_ID;
	}
	public void setArtist_ID(int artist_ID) {
		this.artist_ID = artist_ID;
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
	public String getArtist_Name() {
		return artist_Name;
	}
	public void setArtist_Name(String artist_Name) {
		this.artist_Name = artist_Name;
	}
	public Date getArtist_BornDate() {
		return artist_BornDate;
	}
	public void setArtist_BornDate(Date artist_BornDate) {
		this.artist_BornDate = artist_BornDate;
	}
	public Date getArtist_DiedDate() {
		return artist_DiedDate;
	}
	public void setArtist_DiedDate(Date artist_DiedDate) {
		this.artist_DiedDate = artist_DiedDate;
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
	public boolean isArtist_DeletedFlag() {
		return artist_DeletedFlag;
	}
	public void setArtist_DeletedFlag(boolean artist_DeletedFlag) {
		this.artist_DeletedFlag = artist_DeletedFlag;
	}
	public char getArtist_Type() {
		return artist_Type;
	}
	public void setArtist_Type(char artist_Type) {
		this.artist_Type = artist_Type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((artist_BornDate == null) ? 0 : artist_BornDate.hashCode());
		result = prime * result + (artist_DeletedFlag ? 1231 : 1237);
		result = prime * result
				+ ((artist_DiedDate == null) ? 0 : artist_DiedDate.hashCode());
		result = prime * result + artist_ID;
		result = prime * result
				+ ((artist_Name == null) ? 0 : artist_Name.hashCode());
		result = prime * result + artist_Type;
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
		Artist_Master other = (Artist_Master) obj;
		if (artist_BornDate == null) {
			if (other.artist_BornDate != null)
				return false;
		} else if (!artist_BornDate.equals(other.artist_BornDate))
			return false;
		if (artist_DeletedFlag != other.artist_DeletedFlag)
			return false;
		if (artist_DiedDate == null) {
			if (other.artist_DiedDate != null)
				return false;
		} else if (!artist_DiedDate.equals(other.artist_DiedDate))
			return false;
		if (artist_ID != other.artist_ID)
			return false;
		if (artist_Name == null) {
			if (other.artist_Name != null)
				return false;
		} else if (!artist_Name.equals(other.artist_Name))
			return false;
		if (artist_Type != other.artist_Type)
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
		return "Artist_Master [artist_ID=" + artist_ID + ", created_By="
				+ created_By + ", updated_By=" + updated_By + ", artist_Name="
				+ artist_Name + ", artist_BornDate=" + artist_BornDate
				+ ", artist_DiedDate=" + artist_DiedDate + ", created_On="
				+ created_On + ", updated_On=" + updated_On
				+ ", artist_DeletedFlag=" + artist_DeletedFlag
				+ ", artist_Type=" + artist_Type + "]";
	}
	
	
}
