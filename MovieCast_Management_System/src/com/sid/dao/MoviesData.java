package com.sid.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.sid.entity.Actor;

public class MoviesData {

	public static Map<Integer, Map<String, List<Actor>>> moviesbd() {

		Map<String, List<Actor>> movies2022 = new HashMap<String, List<Actor>>();

		// arraylist for storing actor info
		List<Actor> boysal = new ArrayList<Actor>();

		boysal.add(new Actor("Parth Bhalerao", "Male", 23));
		boysal.add(new Actor("Sumant Shinde", "Male", 25));
		boysal.add(new Actor("Pratik Lad", "Male", 27));
		boysal.add(new Actor("Mrunmayee Deshpande", "Female", 35));
		boysal.add(new Actor("Ritika Shrotri", "Female", 22));
		boysal.add(new Actor("Vaibhav Mangle", "Male", 48));
		boysal.add(new Actor("Yogesh Soman", "Male", 50));

		// add list of boys into movies2022 map
		movies2022.put("boys", boysal);

//		  movies2022.put("Boys", boysal);
		// jhund 2022

		List<Actor> jhundal = new ArrayList<Actor>();
		jhundal.add(new Actor("Amitabh Bachchan", "Male", 80));
		jhundal.add(new Actor("Rinku Rajguru", "Female", 22));
		jhundal.add(new Actor("Akash Thosar", "Male", 29));
		jhundal.add(new Actor("Ankush Gedam", "Male", 24));
		jhundal.add(new Actor("Kishor Kadam", "Male", 54));
		jhundal.add(new Actor("Tanaji Galgunde", "Male", 27));
		jhundal.add(new Actor("Vicky Kadian", "Male", 25));

		// add list of boys into movies2022 map
//		((Map<String, List<Actor>>) movies2022).put("Jhund", jhundal);

		movies2022.put("jhund", jhundal);

		// 2023 movies

		// Tiger3 -2023
		Map<String, List<Actor>> movies2023 = new HashMap<String, List<Actor>>();

		List<Actor> tigeral = new ArrayList<Actor>();

		tigeral.add(new Actor("Salman Khan", "Male", 58));
		tigeral.add(new Actor("Katrina Kaif", "Female", 40));
		tigeral.add(new Actor("Emraan Hashmi", "Male", 44));
		tigeral.add(new Actor("Ranvir Shorey", "Male", 50));
		tigeral.add(new Actor("Girish Karnad", "Male", 81));
		tigeral.add(new Actor("Anupriya Goenka", "Female", 36));
		tigeral.add(new Actor("Sajjad Delafrooz", "Male", 41));

		movies2023.put("tiger", tigeral);
		// jawan -2023

		List<Actor> jawanal = new ArrayList<Actor>();

		jawanal.add(new Actor("Shah Rukh Khan", "Male", 58));
		jawanal.add(new Actor("Nayanthara", "Female", 3));
		jawanal.add(new Actor("Vijay Sethupathi", "Male", 45));
		jawanal.add(new Actor("Deepika Padukone", "Female", 38));
		jawanal.add(new Actor("Sanya Malhotra", "Female", 31));
		jawanal.add(new Actor("Sunil Grover", "Male", 46));
		jawanal.add(new Actor("Priyamani", "Female", 39));

		movies2023.put("jawan", jawanal);
		// subedar 2023

		List<Actor> subedaral = new ArrayList<Actor>();

		subedaral.add(new Actor("Ajay Devgn", "Male", 55));
		subedaral.add(new Actor("Kajol", "Female", 49));
		subedaral.add(new Actor("Pankaj Tripathi", "Male", 48));
		subedaral.add(new Actor("Nawazuddin Siddiqui", "Male", 49));
		subedaral.add(new Actor("Radhika Apte", "Female", 38));
		subedaral.add(new Actor("Jimmy Shergill", "Male", 52));
		subedaral.add(new Actor("Manoj Bajpayee", "Male", 55));

		movies2023.put("subedar", subedaral);

		// ved 2023
		List<Actor> vedal = new ArrayList<Actor>();

		vedal.add(new Actor("Genelia D'Souza", "Female", 36));
		vedal.add(new Actor("Ashok Saraf", "Male", 76));
		vedal.add(new Actor("Jiya Shankar", "Female", 28));
		vedal.add(new Actor("Vidyadhar Joshi", "Male", 50));
		vedal.add(new Actor("Ravindra Mahajani", "Male", 63));
		vedal.add(new Actor("Siddharth Jadhav", "Male", 41));

		movies2023.put("ved", vedal);

		// fighter 2024

		Map<String, List<Actor>> movies2024 = new HashMap<String, List<Actor>>();

		List<Actor> fighteral = new ArrayList<Actor>();

		fighteral.add(new Actor("Hrithik Roshan", "Male", 50));
		fighteral.add(new Actor("Deepika Padukone", "Female", 38));
		fighteral.add(new Actor("Anil Kapoor", "Male", 67));
		fighteral.add(new Actor("Karan Singh Grover", "Male", 41));
		fighteral.add(new Actor("Akshay Oberoi", "Male", 38));
		fighteral.add(new Actor("Parth Siddhpura", "Male", 29));
		fighteral.add(new Actor("Binita Gandhi", "Female", 34));

		movies2024.put("fighter", fighteral);
		// sanghrshyoddha 2024

		List<Actor> sanghal = new ArrayList<Actor>();

		sanghal.add(new Actor("Milind Gunaji", "Male", 63));
		sanghal.add(new Actor("Urmila Kanetkar", "Female", 36));
		sanghal.add(new Actor("Chinmay Mandlekar", "Male", 42));
		sanghal.add(new Actor("Nagesh Bhosle", "Male", 57));
		sanghal.add(new Actor("Madhavi Nemkar", "Female", 40));
		sanghal.add(new Actor("Astad Kale", "Male", 37));
		sanghal.add(new Actor("Bharat Jadhav", "Male", 50));

		movies2024.put("sangh", sanghal);

		Map<Integer, Map<String, List<Actor>>> moviesdb = new HashMap();

		moviesdb.put(2022, movies2022);
		moviesdb.put(2023, movies2023);
		moviesdb.put(2024, movies2024);

		return moviesdb;

	}

}
