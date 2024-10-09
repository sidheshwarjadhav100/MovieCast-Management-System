package com.sid.controller;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sid.entity.Actor;
import com.sid.service.Logic;

public class Controllers {

//get all movies form DB
	public static List getAllMoviesFromDB() {

		List allmovies = Logic.getAllMovies();
	

		return allmovies;
	}

	// get movies by yearly
	public static List getMoviesYearly(int year) {
		// get movies yearly
		List moviesyear = Logic.getMoviesYearlyServie(year);
		return moviesyear;
	}

	// get perticular movie cast details
	public static List getPerticulareMovieCast(String movie) {

		List perticulatmoviecast = Logic.getPerticularMovie(movie);

		return perticulatmoviecast;
	}

	
//get single actor full info.
	public static List getSingleActorInfo(String name) {
		List actormovies = Logic.getSingleActorFullInfo(name);

		return actormovies;
	}

	public static List<Actor> getAllActor() {

		List actormovies = Logic.getAllActor();

		return actormovies;
	}
	
	// get all movies of any actor
		public static List getAllMoviesOfActor(String name) {
			List actormovies = Logic.getActorMovies(name);
			return actormovies;
		}

}
