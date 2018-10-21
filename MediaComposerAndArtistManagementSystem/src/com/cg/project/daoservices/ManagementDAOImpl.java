package com.cg.project.daoservices;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.project.beans.Artist_Master;
import com.cg.project.beans.Composer_Master;
import com.cg.project.beans.Song_Master;

public class ManagementDAOImpl implements ManagementDAO{
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager entityManager= factory.createEntityManager();
	@Override
	public Artist_Master saveArtist(Artist_Master artist) {
		entityManager.getTransaction().begin();
		entityManager.persist(artist);
		entityManager.getTransaction().commit();
		entityManager.close();
		return artist;
	}
	
	@Override
	public Composer_Master saveComposer(Composer_Master composer) {
		entityManager.getTransaction().begin();
		entityManager.persist(composer);
		entityManager.getTransaction().commit();
		entityManager.close();
		return composer;
	}

	@Override
	public Artist_Master findArtist(String artist_Name) {
		return entityManager.find(Artist_Master.class, artist_Name);
	}

	@Override
	public Composer_Master findComposer(String composer_Name) {
		return entityManager.find(Composer_Master.class, composer_Name);
	}

	@Override
	public boolean updateArtist(Artist_Master artist) {
		EntityManager entityManager= factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(artist);
		entityManager.getTransaction().commit();
		entityManager.close();		
		return true;
	}

	@Override
	public boolean updateComposer(Composer_Master composer) {
		EntityManager entityManager= factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(composer);
		entityManager.getTransaction().commit();
		entityManager.close();		
		return true;
	}

	@Override
	public int saveSong(Song_Master song) {
		EntityManager entityManager= factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(song);
		entityManager.getTransaction().commit();
		entityManager.close();	
		return song.getSong_ID();
	}

	@Override
	public ArrayList<Song_Master> findSong(char ch, int id) {
		if(ch=='A'){
			EntityManager entityManager= factory.createEntityManager();
			Query query= entityManager.createNamedQuery("getFewSongsByArtist");
			query.setParameter("artist_ID", id);
			@SuppressWarnings("unchecked")
			ArrayList<Song_Master> list=(ArrayList<Song_Master>)query.getResultList();
			return list;
		}
		else if(ch=='C'){
			EntityManager entityManager= factory.createEntityManager();
			Query query= entityManager.createNamedQuery("getFewSongsByComposer");
			query.setParameter("composer_ID", id);
			@SuppressWarnings("unchecked")
			ArrayList<Song_Master> list=(ArrayList<Song_Master>)query.getResultList();
			return list;
		}
			return null;
	}
}
