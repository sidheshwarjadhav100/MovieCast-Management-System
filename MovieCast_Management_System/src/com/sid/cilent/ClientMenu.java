package com.sid.cilent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.sid.controller.Controllers;
import com.sid.entity.Actor;

public class ClientMenu {

	static ArrayList<Actor> movies2022 = new ArrayList<Actor>();
	static int a = 0;
	static int count = 0;
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		// create BufferedReader Object for accept input from user
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		// do {
		System.out.println("WELCOME");
		do {

			System.out.println("MAIN MENU");
			// System.out.println("");
			System.out.println("1.Add Movie");
			System.out.println("2.Delete Movie");
			System.out.println("3.see all movie of database");
			System.out.println("4.get movies yearly");
			System.out.println("5.see petricular movie cast");// all actros of any movie
			System.out.println("6.get all actors and their info ");
			System.out.println("7.Search movies by actor name");
			// System.out.println("6.exit ");

			if (a >= 1) {
				System.out.println("8.Exit");

			}
			a++;
			System.out.println("Enter a choice");

			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("invalid input");

			}

			switch (choice) {
			case 1: {
				// add movie
				//
				//

				// get all movies of 2022
//				int year = 2022;
//				List<String> allMovies2022 = Controllers.moviesInfo(year);
//				Set<String> setobj = new LinkedHashSet(allMovies2022);
//				System.out.println("All Movies Of " + year);
//				System.out.println();
//				for (String string : setobj) {
//					System.out.println(string);
//				}

				break;
			}

			case 2: {

				break;
			}

			case 3: {
				// to see all movies from db

				System.out.println();
				System.out.println("All MOVIES OF DATABASE");
				List getallmovies = Controllers.getAllMoviesFromDB();
				for (Object movie : getallmovies) {
					System.out.println(movie);

				}
				System.out.println("===================================");
				// System.out.println("Enter Movie Name For All Info");

				break;

			}

			case 4: {
				int year = 0;
				// get movies yearly
				System.out.println("Enter Year");
				year = sc.nextInt();
				// List<Integer> getmoviesyearly = Controllers.getMoviesYearly(year);
				List getmovies = Controllers.getMoviesYearly(year);
				System.out.println(getmovies);

				// System.out.println("is the year");

				break;
			}
			case 5: {
				// get perticular movie cast
				List getallmovies = Controllers.getAllMoviesFromDB();
				for (Object string : getallmovies) {
					System.out.println(string);
				}

				System.out.println();
				String moviename = null;
				System.out.println("Enter movie name which you want to see cast");
				try {
					moviename = bf.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				List ls = Controllers.getPerticulareMovieCast(moviename);
				for (Object string : ls) {

					System.out.println(string);

				}

				break;

			}

			case 6: {

				// get all actors and their info

				String name = null;
				// first see all player
				System.out.println();
				System.out.println("===============================");
				System.out.println("All Actors Of Our DB");
				System.out.println("===============================");
				List listoffallactor = Controllers.getAllActor();

				for (Object actor : listoffallactor) {
					System.out.println(actor);
				}
				System.out.println();
				System.out.println("=================");
				// search movie by actor name
				System.out.println("Enter Actor Name");
				try {
					name = bf.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				List actorallmovies = Controllers.getSingleActorInfo(name);
				System.out.println("Actor Basic Information[Name,Gender,Age] ");
				for (Object object : actorallmovies) {
					System.out.println(object);

				}

				break;

			}
			case 7: {
				String name = null;
				// first see all player
				System.out.println();
				System.out.println("===============================");
				System.out.println("All Actors Of Our DB");
				System.out.println("===============================");
				List listoffallactor = Controllers.getAllActor();

				for (Object actor : listoffallactor) {
					System.out.println(actor);
				}
				System.out.println();
				System.out.println("=================");
				// search movie by actor name
				System.out.println("Enter Actor Name");
				try {
					name = bf.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				List actorallmovies = Controllers.getAllMoviesOfActor(name);
				System.out.println("Actor Movies are ");
				System.out.println("Siddheshwar");
				System.out.println();
				for (Object object : actorallmovies) {
					System.out.println(object);

				}

				break;

			}
			case 8: {

				break;

			}

			}
			if (choice == 8) {
				break;
			}
		} while (true);
	}

}
