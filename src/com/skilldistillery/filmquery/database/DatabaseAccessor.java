package com.skilldistillery.filmquery.database;

import java.util.List;

import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public interface DatabaseAccessor {
	
  public Film findFilmById(int filmId);
  
  public Actor findActorById(int actorId);
  
  public List<Actor> findActorsByFilmId(int filmId);
  
  public List<Film> keywordSearch (String keywords);
  
  public List<Film> getFilmFromActorId(int actorId);
  
  public String languageOfFilm(int filmId);
}
