package com.cg.project.beans;

public class MusicSociety_Master {
	private char composer_MusicSocietyID;
	private String composer_MusicSocietyName;
	public MusicSociety_Master() {
		super();
	}
	public MusicSociety_Master(char composer_MusicSocietyID,
			String composer_MusicSocietyName) {
		super();
		this.composer_MusicSocietyID = composer_MusicSocietyID;
		this.composer_MusicSocietyName = composer_MusicSocietyName;
	}
	public char getComposer_MusicSocietyID() {
		return composer_MusicSocietyID;
	}
	public void setComposer_MusicSocietyID(char composer_MusicSocietyID) {
		this.composer_MusicSocietyID = composer_MusicSocietyID;
	}
	public String getComposer_MusicSocietyName() {
		return composer_MusicSocietyName;
	}
	public void setComposer_MusicSocietyName(String composer_MusicSocietyName) {
		this.composer_MusicSocietyName = composer_MusicSocietyName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + composer_MusicSocietyID;
		result = prime
				* result
				+ ((composer_MusicSocietyName == null) ? 0
						: composer_MusicSocietyName.hashCode());
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
		MusicSociety_Master other = (MusicSociety_Master) obj;
		if (composer_MusicSocietyID != other.composer_MusicSocietyID)
			return false;
		if (composer_MusicSocietyName == null) {
			if (other.composer_MusicSocietyName != null)
				return false;
		} else if (!composer_MusicSocietyName
				.equals(other.composer_MusicSocietyName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MusicSociety_Master [composer_MusicSocietyID="
				+ composer_MusicSocietyID + ", composer_MusicSocietyName="
				+ composer_MusicSocietyName + "]";
	}
	
}
