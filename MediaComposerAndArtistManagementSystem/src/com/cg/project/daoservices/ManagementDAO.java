package com.cg.project.daoservices;

import java.util.ArrayList;

import com.cg.project.beans.Artist_Master;
import com.cg.project.beans.Composer_Master;
import com.cg.project.beans.Song_Master;

public interface ManagementDAO {
	Artist_Master saveArtist (Artist_Master artist);
	Composer_Master saveComposer(Composer_Master composer);
	Artist_Master findArtist(String artist_Name);
	Composer_Master findComposer(String composer_Name);
	boolean updateArtist(Artist_Master artist);
	boolean updateComposer(Composer_Master composer);
	int saveSong(Song_Master song);
	ArrayList<Song_Master> findSong(char ch, int id);
}
