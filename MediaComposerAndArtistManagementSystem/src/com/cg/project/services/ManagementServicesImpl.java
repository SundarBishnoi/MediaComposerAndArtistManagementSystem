package com.cg.project.services;

import java.util.ArrayList;

import com.cg.project.beans.Artist_Master;
import com.cg.project.beans.Composer_Master;
import com.cg.project.beans.Song_Master;
import com.cg.project.daoservices.ManagementDAO;
import com.cg.project.daoservices.ManagementDAOImpl;

public class ManagementServicesImpl implements ManagementServices{
	
	ManagementDAO managementDAO= new ManagementDAOImpl();
	
	@Override
	public int addArtist(Artist_Master artist) {
		artist=managementDAO.saveArtist(artist);
		return artist.getArtist_ID();
	}

	@Override
	public int addComposer(Composer_Master composer) {
		composer=managementDAO.saveComposer(composer);
		return composer.getComposer_ID();
	}

	@Override
	public Artist_Master searchArtist(String artist_Name) {
		Artist_Master artist =managementDAO.findArtist(artist_Name);
//		if(artist==null) throw new AssociateDetailsNotFoundException("Associate Details not found");
		return artist;
	}

	@Override
	public Composer_Master searchComposer(String composer_Name) {
		Composer_Master composer =managementDAO.findComposer(composer_Name);
//		if(artist==null) throw new AssociateDetailsNotFoundException("Associate Details not found");
		return composer;
	}

	@Override
	public boolean editArtist(Artist_Master artist) {
		managementDAO.updateArtist(artist);
		return true;
	}

	@Override
	public boolean editComposer(Composer_Master composer) {
		managementDAO.updateComposer(composer);
		return true;
	}

	@Override
	public int addSong(Song_Master song) {
		return managementDAO.saveSong(song);
	}

	@Override
	public ArrayList<Song_Master> searchSong(char ch, int id) {
		return managementDAO.findSong(ch, id);
	}

}