package com.cg.project.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="getFewSongsByArtist", query="select s from Song_Master s where s.artist_ID=:artist_ID"),
	@NamedQuery(name="getFewSongsByComposer", query="select s from Song_Master s where s.composer_ID=:composer_ID")
})
public class Song_Master {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int song_ID;
	private int created_By,updated_By;
	private String song_Name;
	private Date song_Duration;
	private String created_On,updated_On;
	private boolean song_DeletedFlag;
	@Embedded
	private Artist_Song_Assoc artist;
	@Embedded
	private Composer_Song_Assoc composer;
	
	public Song_Master() {
		super();
	}
	
	
	public Song_Master(int song_ID, int created_By, int updated_By,
			String song_Name, Date song_Duration, boolean song_DeletedFlag,
			Artist_Song_Assoc artist, Composer_Song_Assoc composer) {
		super();
		this.song_ID = song_ID;
		this.created_By = created_By;
		this.updated_By = updated_By;
		this.song_Name = song_Name;
		this.song_Duration = song_Duration;
		this.song_DeletedFlag = song_DeletedFlag;
		this.artist.setSong_ID(song_ID);
		this.artist = artist;
		this.composer.setSong_ID(song_ID);
		this.composer = composer;
		setCreated_On();
		setUpdated_On();
	}


//	public Song_Master(int song_ID, int created_By, int updated_By,
//			String song_Name, Date song_Duration, String created_On,
//			String updated_On, boolean song_DeletedFlag,Artist_Song_Assoc artist, Composer_Song_Assoc composer) {
//		super();
//		this.song_ID = song_ID;
//		this.created_By = created_By;
//		this.updated_By = updated_By;
//		this.song_Name = song_Name;
//		this.song_Duration = song_Duration;
//		this.created_On = created_On;
//		this.updated_On = updated_On;
//		this.song_DeletedFlag = song_DeletedFlag;
//		this.artist=artist;
//		this.composer=composer;
//	}
	
	public int getSong_ID() {
		return song_ID;
	}
	public void setSong_ID(int song_ID) {
		this.song_ID = song_ID;
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
	public String getSong_Name() {
		return song_Name;
	}
	public void setSong_Name(String song_Name) {
		this.song_Name = song_Name;
	}
	public Date getSong_Duration() {
		return song_Duration;
	}
	public void setSong_Duration(Date song_Duration) {
		this.song_Duration = song_Duration;
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
	public boolean isSong_DeletedFlag() {
		return song_DeletedFlag;
	}
	public void setSong_DeletedFlag(boolean song_DeletedFlag) {
		this.song_DeletedFlag = song_DeletedFlag;
	}
		
	public Artist_Song_Assoc getArtist() {
		return artist;
	}
	public void setArtist(Artist_Song_Assoc artist) {
		this.artist = artist;
	}
	public Composer_Song_Assoc getComposer() {
		return composer;
	}
	public void setComposer(Composer_Song_Assoc composer) {
		this.composer = composer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result
				+ ((composer == null) ? 0 : composer.hashCode());
		result = prime * result + created_By;
		result = prime * result
				+ ((created_On == null) ? 0 : created_On.hashCode());
		result = prime * result + (song_DeletedFlag ? 1231 : 1237);
		result = prime * result
				+ ((song_Duration == null) ? 0 : song_Duration.hashCode());
		result = prime * result + song_ID;
		result = prime * result
				+ ((song_Name == null) ? 0 : song_Name.hashCode());
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
		Song_Master other = (Song_Master) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (composer == null) {
			if (other.composer != null)
				return false;
		} else if (!composer.equals(other.composer))
			return false;
		if (created_By != other.created_By)
			return false;
		if (created_On == null) {
			if (other.created_On != null)
				return false;
		} else if (!created_On.equals(other.created_On))
			return false;
		if (song_DeletedFlag != other.song_DeletedFlag)
			return false;
		if (song_Duration == null) {
			if (other.song_Duration != null)
				return false;
		} else if (!song_Duration.equals(other.song_Duration))
			return false;
		if (song_ID != other.song_ID)
			return false;
		if (song_Name == null) {
			if (other.song_Name != null)
				return false;
		} else if (!song_Name.equals(other.song_Name))
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
		return "Song_Master [song_ID=" + song_ID + ", created_By=" + created_By
				+ ", updated_By=" + updated_By + ", song_Name=" + song_Name
				+ ", song_Duration=" + song_Duration + ", created_On="
				+ created_On + ", updated_On=" + updated_On
				+ ", song_DeletedFlag=" + song_DeletedFlag + ", artist="
				+ artist + ", composer=" + composer + "]";
	}
	
	
	
}
