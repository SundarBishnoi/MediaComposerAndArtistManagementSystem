package com.cg.project.services;

import java.util.ArrayList;

import com.cg.project.beans.Artist_Master;
import com.cg.project.beans.Composer_Master;
import com.cg.project.beans.Song_Master;

public interface ManagementServices {
	int addArtist(Artist_Master artist);
	int addComposer(Composer_Master composer);
	Artist_Master searchArtist(String artist_Name);
	Composer_Master searchComposer(String composer_Name);
	boolean editArtist(Artist_Master artist);
	boolean editComposer(Composer_Master composer);	
	int addSong(Song_Master song);
	ArrayList<Song_Master> searchSong(char ch, int id);
}
