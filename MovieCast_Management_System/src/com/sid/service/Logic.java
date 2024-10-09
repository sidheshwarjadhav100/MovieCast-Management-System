package com.sid.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sid.controller.Controllers;
import com.sid.dao.MoviesData;
import com.sid.entity.Actor;

public class Logic {

	private static final Object Integer = null;
	private static final Object String = null;

	static List moviesyerly = new ArrayList();
	static List allmovies = new ArrayList();

	static Map<java.lang.Integer, Map<java.lang.String, List<Actor>>> moviesmap = MoviesData.moviesbd();

	// get all movies form db
	public static List getAllMovies() {

//		List<Actor> allmovies = new ArrayList<String>();

		List<String> movies = new ArrayList<String>();
		for (Map.Entry<Integer, Map<String, List<Actor>>> outerentry : moviesmap.entrySet()) {

			Integer av = outerentry.getKey();

			Integer outerKey = outerentry.getKey();

			Map<String, List<Actor>> innermapMap = outerentry.getValue();

			for (Entry<String, List<Actor>> innernetry : innermapMap.entrySet()) {

				allmovies.add(innernetry.getKey());

			}

		}

		return allmovies;
	}

	// get all movies yearly.
	public static List getMoviesYearlyServie(int year) {

		List<String> movies = new ArrayList<String>();
		for (Map.Entry<Integer, Map<String, List<Actor>>> outerentry : moviesmap.entrySet()) {

			Integer av = outerentry.getKey();

			Integer outerKey = outerentry.getKey();

			Map<String, List<Actor>> innermapMap = outerentry.getValue();

			for (Entry<String, List<Actor>> innernetry : innermapMap.entrySet()) {

				if (outerentry.getKey() == year) {
					// movies.innernetry.getKey();

					movies.add(innernetry.getKey());
				}

			}

		}

		return movies;

	}

	// to see perticular movie cast details
	public static List getPerticularMovie(String movie) {
		List moviecast = new ArrayList();
		Map<Integer, Map<String, List<Actor>>> perticularmovie = MoviesData.moviesbd();
		List<String> movies = new ArrayList<String>();
		for (Map.Entry<Integer, Map<String, List<Actor>>> outerentry : perticularmovie.entrySet()) {

			Integer av = outerentry.getKey();
			Integer outerKey = outerentry.getKey();
			Map<String, List<Actor>> innermapMap = outerentry.getValue();

			for (Entry<String, List<Actor>> innernetry : innermapMap.entrySet()) {

				List<Actor> mov = innernetry.getValue();

				for (Actor string : mov) {

					if (innernetry.getKey().equalsIgnoreCase(movie)) {
						moviecast.add(string.getName());
					}

				}
			}
		}
		return moviecast;
	}

	public static List getSingleActorFullInfo(String name) {

		Map<Integer, Map<String, List<Actor>>> getactor = MoviesData.moviesbd();
		List actorallmovies = new ArrayList();
		for (Map.Entry<Integer, Map<String, List<Actor>>> outermap : getactor.entrySet()) {

			Integer outerkey = outermap.getKey();
			Integer outerKey = outermap.getKey();

			Map<java.lang.String, List<Actor>> innermap = outermap.getValue();

			for (Entry<String, List<Actor>> inn : innermap.entrySet()) {
				List<Actor> actors = inn.getValue();

				for (Actor act : actors) {
					if (act.getName().equalsIgnoreCase(name)) {

						actorallmovies.add(act);
					}

				}

			}

		}

		return actorallmovies;
	}

	public static List getAllActor() {

		List<Actor> allplayers = new ArrayList();
		Map<Integer, Map<String, List<Actor>>> getactor = MoviesData.moviesbd();
		List lst = new ArrayList();
		for (Map.Entry<Integer, Map<String, List<Actor>>> outermap : getactor.entrySet()) {

			Integer outerkey = outermap.getKey();
			Integer outerKey = outermap.getKey();

			Map<java.lang.String, List<Actor>> innermap = outermap.getValue();

			for (Entry<String, List<Actor>> inn : innermap.entrySet()) {
				List<Actor> actors = inn.getValue();

				for (Actor act : actors) {
					System.out.println(act.getName());

				}

			}

		}

		return allplayers;

	}

	// get all movies of any actor
	public static List getActorMovies(String name) {
		Map<Integer, Map<String, List<Actor>>> getactor = MoviesData.moviesbd();
		List actorallmovies = new ArrayList();
		for (Map.Entry<Integer, Map<String, List<Actor>>> outermap : getactor.entrySet()) {

			Integer outerkey = outermap.getKey();

			Map<java.lang.String, List<Actor>> innermap = outermap.getValue();

			Set<java.lang.String> movnames = innermap.keySet();
			for (String mn : movnames) {
				List<Actor> actorlist = innermap.get(mn);
				for (Actor actorobject : actorlist) {
					if (actorobject.getName().equals(name)) {
						actorallmovies.add(mn);

					}if (actorallmovies.isEmpty()) {
						actorallmovies.add("actor not found");
					}
				}
			}

		}

		return actorallmovies;
	}

}
