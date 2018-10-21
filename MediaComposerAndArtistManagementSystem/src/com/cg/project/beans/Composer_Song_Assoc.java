package com.cg.project.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Embeddable;
@Embeddable
public class Composer_Song_Assoc {
	private int composer_ID;
	private int created_By, updated_By,song_ID;
	private String created_On, updated_On;
	public Composer_Song_Assoc() {
		super();
	}
	
	
public Composer_Song_Assoc(int composer_ID, int created_By, int updated_By) {
		super();
		this.composer_ID = composer_ID;
		this.created_By = created_By;
		this.updated_By = updated_By;
		//this.song_ID = song_ID;
		setCreated_On();
		setUpdated_On();
	}


//	public Composer_Song_Assoc(int composer_ID, int created_By, int updated_By,
//			int song_ID, String created_On, String updated_On) {
//		super();
//		this.composer_ID = composer_ID;
//		this.created_By = created_By;
//		this.updated_By = updated_By;
//		this.song_ID = song_ID;
//		this.created_On = created_On;
//		this.updated_On = updated_On;
//	}
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
	public int getSong_ID() {
		return song_ID;
	}
	public void setSong_ID(int song_ID) {
		this.song_ID = song_ID;
	}
	public String getCreated_On() {
		return created_On;
	}
	public void setCreated_On() {
		Date date= new Date();
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-mm-yyyy");
		this.created_On = dateFormat.format(date);
	}
	public String getUpdated_On() {
		return updated_On;
	}
	public void setUpdated_On() {
		Date date= new Date();
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-mm-yyyy");
		this.updated_On = dateFormat.format(date);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + composer_ID;
		result = prime * result + created_By;
		result = prime * result
				+ ((created_On == null) ? 0 : created_On.hashCode());
		result = prime * result + song_ID;
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
		Composer_Song_Assoc other = (Composer_Song_Assoc) obj;
		if (composer_ID != other.composer_ID)
			return false;
		if (created_By != other.created_By)
			return false;
		if (created_On == null) {
			if (other.created_On != null)
				return false;
		} else if (!created_On.equals(other.created_On))
			return false;
		if (song_ID != other.song_ID)
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
		return "Composer_Song_Assoc [composer_ID=" + composer_ID
				+ ", created_By=" + created_By + ", updated_By=" + updated_By
				+ ", song_ID=" + song_ID + ", created_On=" + created_On
				+ ", updated_On=" + updated_On + "]";
	}
	
}
